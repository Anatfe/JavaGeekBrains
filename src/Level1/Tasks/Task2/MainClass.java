package Level1.Task.Task2;


public class MainClass {
    public static void main(String[] args) {
        int[] array = {2,6,7,1,-54};
        arrMinMax(array);

        int[] array2 = {8,2,3,10,3};
        arrAmount(array2);
    }

    public static void arrMinMax(int[] array) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) min = i;
            if (array[i] > array[max]) max = i;
        }
        System.out.println("Минимальный элемент: "+min+", значение: "+array[min]);
        System.out.println("Максимальный элемент: "+max+", значение: "+array[max]);
    }

    public static void arrAmount(int[] array) {
        int valleft = 0;
        int valright;
        int j;
        for (int i = 0; i < array.length-1; i++) {
            valleft += array[i];
            valright = 0;
            for (j = array.length-1; j > i; j--) {
                valright += array[j];
                if (valleft<valright) break;

            }
            if (valleft == valright){
                String strValue = "(";
                for (int k = 0; k <= i; k++) {
                    strValue += array[k]+" ";
                }
                strValue += "||";
                for (int k = array.length-1; k >= j ; k--) {
                    strValue +=  array[k]+" ";
                }
                strValue += ")";
                System.out.println("Значения равны: "+strValue);
                return;
            }
        }
        System.out.println("Нет равенства ");

    }
}
