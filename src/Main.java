import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        Scanner in=new Scanner(System.in);
        //1.2
        System.out.println("Введите число:");
        int n=in.nextInt();
        System.out.println("Сумма последних двух знаков числа равна:");
        System.out.println(m.sumLastNums(n));
        //1.4
        System.out.println("Введите число:");
        int n2=in.nextInt();
        System.out.println("Число положительное?");
        System.out.println(m.isPositive(n2));
        //1.6
        System.out.println("Введите символ");
        char n3 = in.next().charAt(0);
        System.out.println("Этот символ является буквой в диапазоне от A до Z?");
        System.out.println(m.isUpperCase(n3));
        //1.8
        System.out.println("Введите 1-ое число:");
        int a=in.nextInt();
        System.out.println("Введите 2-ое число:");
        int b=in.nextInt();
        System.out.println("Одно из чисел делит другое нацело?");
        System.out.println(m.isDivisor(a,b));
        //1.10
        System.out.println("Введите 5 чисел подряд через Enter:");
        int a1=in.nextInt();
        int b1=in.nextInt();
        int c1=in.nextInt();
        int d1=in.nextInt();
        int e1=in.nextInt();
        System.out.println("Последовательное сложение суммы цифр двух чисел из разряда единиц для 5 чисел равна:");
        System.out.println(m.lastNumSum(e1,m.lastNumSum(d1,m.lastNumSum(c1,m.lastNumSum(a1,b1)))));
        //2.2
        System.out.println("Введите делимое");
        int a2=in.nextInt();
        System.out.println("Введите делитель");
        int b2=in.nextInt();
        System.out.println("Результат деления:");
        System.out.println(m.safeDiv(a2,b2));
        //2.4
        System.out.println("Введите два числа для сравнения");
        System.out.println("1-ое число:");
        int a3=in.nextInt();
        System.out.println("2-ое число:");
        int b3=in.nextInt();
        System.out.println("Результат сравнения:");
        System.out.println(m.makeDecision(a3,b3));
        //2.6
        System.out.println("Введите 3 числа через Enter");
        int a4=in.nextInt();
        int b4=in.nextInt();
        int c4=in.nextInt();
        System.out.println("Сумма любых двух чисел дает третье?");
        System.out.println(m.sum3(a4,b4,c4));
        //2.8
        System.out.println("Введите число:");
        int n4=in.nextInt();
        System.out.println("Возраст:");
        System.out.println(m.age(n4));
        //2.10
        System.out.println("Введите название дня недели:");
        String n5=in.nextLine();
        System.out.println("Названия всех последующих до конца недели дней:");
        m.printDays(n5);
        //3.2
        System.out.println("Введите число:");
        int n6=in.nextInt();
        System.out.println("Следующие за числом числа по убыванию:");
        System.out.println(m.reverseListNums(n6));
        //3.4
        System.out.println("Введите число, которое надо возвести в степень:");
        int a5=in.nextInt();
        System.out.println("Введите степень:");
        int b5=in.nextInt();
        System.out.println("Результат возведения числа "+a5+" в степень "+b5);
        System.out.println(m.pow(a5,b5));
        //3.6
        System.out.println("Введите число:");
        int n7=in.nextInt();
        System.out.println("Знаки числа одинаковые?");
        System.out.println(m.equalNum(n7));
        //3.8
        System.out.println("Введите число:");
        int n8=in.nextInt();
        System.out.println("Треугольник из ‘*’, у которого х символов в высоту, а количество \n"+"символов в ряду совпадает с номером строки, выглядит так:");
        m.leftTriangle(n8);
        //3.10
        m.guessGame();
        //4.2
        System.out.println("Задайте размер массива");
        int r=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] mas=new int[r];
        for(int i=0;i<mas.length;i++){
            int z=in.nextInt();
            mas[i]=z;
        }
        System.out.println("Индекс какого элемента нужен?");
        int pos=in.nextInt();
        System.out.println("Индекс последнего вхождения элемента");
        System.out.println(m.findLast(mas,pos));
        //4.4
        System.out.println("Задайте размер массива");
        int r2=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] mas2=new int[r2];
        for(int i=0;i<mas2.length;i++){
            int z2=in.nextInt();
            mas2[i]=z2;
        }
        System.out.println("Введенный массив:");
        for(int i:mas2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Введите индекс массива, в который добавится элемент");
        int pos2=in.nextInt();
        System.out.println("Введите значение, которое вставится на этот индекс массива");
        int znach2=in.nextInt();
        System.out.println("Получившийся массив");
        int[] nmas1=m.add(mas2,znach2,pos2);
        for(int i:nmas1){
            System.out.print(i+" ");
        }
        System.out.println();
        //4.6
        System.out.println("Задайте размер массива");
        int r3=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] mas3=new int[r3];
        for(int i=0;i<mas3.length;i++){
            int z3=in.nextInt();
            mas3[i]=z3;
        }
        System.out.println("Введенный массив:");
        for(int i:mas3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Данный массив задом-наперед");
        m.reverse(mas3);
        System.out.println();
        //4.8
        System.out.println("Задайте размер 1-го массива");
        int raz1=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] ar1=new int[raz1];
        for(int i=0;i<ar1.length;i++){
            int sim1=in.nextInt();
            ar1[i]=sim1;
        }
        System.out.println("1-ый массив:");
        for(int i:ar1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Задайте размер 2-го массива");
        int raz2=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] ar2=new int[raz2];
        for(int i=0;i<ar2.length;i++){
            int sim2=in.nextInt();
            ar2[i]=sim2;
        }
        System.out.println("2-ой массив:");
        for(int i:ar2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Новый массив, в котором сначала идут элементы\n"+"первого массива, а затем второго");
        int[] nmas2=m.concat(ar1,ar2);
        for(int i:nmas2){
            System.out.print(i+" ");
        }
        System.out.println();
        //4.10
        System.out.println("Задайте размер массива");
        int r4=in.nextInt();
        System.out.println("Введите числа в массив");
        int[] mas4=new int[r4];
        for(int i=0;i<mas4.length;i++){
            int z4=in.nextInt();
            mas4[i]=z4;
        }
        System.out.println("Введенный массив:");
        for(int i:mas4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Данный массив без отрицательных чисел");
        int[] nmas3=m.deleteNegative(mas4);
        for(int i:nmas3){
            System.out.print(i+" ");
        }
        System.out.println();

        in.close();
    }

    //1.2
    public int sumLastNums (int x){
        return x % 10 + x / 10 % 10;
    }
    //1.4
    public boolean isPositive (int x){
        if(x<1){
            return false;
        }
        return true;
    }
    //1.6
    public boolean isUpperCase (char x){
        if((x>='A') && (x<='Z')){
            return true;
        }
        return false;
    }
    //1.8
    public boolean isDivisor (int a, int b){
        if((a % b == 0) || (b % a ==0)){
            return true;
        }
        return false;
    }
    //1.10
    public int lastNumSum(int a, int b){
        return a%10+b%10;
    }

    //2.2
    public double safeDiv (int x, int y){
        if (y==0){
            return 0;
        }
        return (double)x/y;
    }
    //2.4
    public String makeDecision (int x, int y){
        if (x<y){
            return x+"<"+y;
        }
        else if (x>y){
            return x+">"+y;
        }
        else {
            return x+"="+y;
        }
    }
    //2.6
    public boolean sum3 (int x, int y, int z){
        if ((x+y==z)||(x+z==y)||(y+z==x)){
            return true;
        }
        return false;
    }
    //2.8
    public String age (int x){
        if(x%10==1 && x!=11){
            return x+" год";
        }
        else if((x%10==2 || x%10==3 || x%10==4) && x!=12 && x!=13 && x!=14){
            return x+" года";
        }
        else{
            return x+" лет";
        }
    }
    //2.10
    public void printDays (String x){
        switch (x){
            case "понедельник": System.out.println("понедельник");
            case "вторник": System.out.println("вторник");
            case "среда": System.out.println("среда");
            case "четверг": System.out.println("четверг");
            case "пятница": System.out.println("пятница");
            case "суббота": System.out.println("суббота");
            case "воскресенье": System.out.println("воскресенье"); break;
            default: System.out.println("это не день недели"); break;
        }
    }
    //3.2
    public String reverseListNums (int x){
        String ans="";
        for (int i = x; i >= 0; i--) {
            ans+=i+" ";
        }
        return ans;
    }
    //3.4
    public int pow (int x, int y){
        int rez=1;
        while (y>0){
            rez=rez*x;
            y--;
        }
        return rez;
    }
    //3.6
    public boolean equalNum (int x){
        int n=x%10;
        x=x/10;
        while (x>0){
            int m=x%10;
            if(n!=m){
                return false;
            }
            x=x/10;
        }
        return true;
    }
    //3.8
    public void leftTriangle (int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //3.10
    public void guessGame(){
        Scanner in=new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9:");
        int x=in.nextInt();
        Random rand = new Random();
        int num = rand.nextInt(10);
        int popitka=1;
        while (x!=num){
            System.out.println("Вы не угадали, введите число от 0 до 9");
            popitka++;
            x=in.nextInt();
        }
        System.out.println("Вы угадали!");
        if (popitka%10==1 && popitka!=11) {
            System.out.println("Вы отгадали число за " + popitka + " попытку");
        }
        else if ((popitka%10==2 || popitka%10==3 || popitka%10==4) && popitka%10!=12 && popitka%10!=13 && popitka%10!=14) {
            System.out.println("Вы отгадали число за " + popitka + " попытки");
        }
        else {
            System.out.println("Вы отгадали число за " + popitka + " попыток");
        }
    }
    //4.2
    public int findLast (int[] arr, int x){
        int f=0;
        int i=arr.length-1;
        while(i>=0){
            if((x==arr[i]) && (f==0)){
                f=1;
                return i;
            }
            i--;
        }
        return -1;
    }
    //4.4
    public int[]add (int[] arr, int x, int pos){
        int[] nmas=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            nmas[i]=arr[i];
        }
        nmas[pos]=x;
        for (int i=pos+1;i<arr.length+1;i++){
            nmas[i]=arr[i-1];
        }
        return nmas;
    }
    //4.6
    public void reverse (int[] arr){
        int[] nmas=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nmas[i]=arr[arr.length-1-i];
        }
        for(int i:nmas){
            System.out.print(i+" ");
        }
    }
    //4.8
    public int[] concat (int[] arr1,int[] arr2){
        int[] nmas=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            nmas[i]=arr1[i];
        }
        for (int i=arr1.length;i<arr1.length+arr2.length;i++){
            nmas[i]=arr2[i-arr1.length];
        }
        return nmas;
    }
    //4.10
    public int[] deleteNegative (int[] arr){
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                k++;
            }
        }
        int[] nmas=new int[arr.length-k];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                nmas[j]=arr[i];
                j++;
            }
        }
        return nmas;
    }

}