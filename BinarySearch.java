public class BinarySearch {






    /**
     * ��������
     * */
    public  void  sort(int[]a){
        //ð������
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    //����
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }




    }



    /**
     * ����targetԪ���Ƿ���a�����д��ڡ�
     *
     * ���ֲ��ң�
     *   ��������顣
     *
     * @param  a  ��������
     *
     *
     * */
    public  boolean   binarySearch(int[] a,int target){


        int left=0,right=a.length-1;


        int mid=(left+right)/2;


        while(left<=right){
            if(a[mid]==target){

                return true;
            }
            if(a[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }

            mid=(left+right)/2;
        }


        return false;





    }

    public static void main(String[] args) {

        int[] a={1,6,2,9,19,12,8};

        BinarySearch binarySearch=new BinarySearch();
        binarySearch.sort(a);


       int target=19;

       boolean result=binarySearch.binarySearch(a,target);
        System.out.println(result);



    }


}
