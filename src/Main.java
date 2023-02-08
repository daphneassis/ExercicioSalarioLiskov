public class Main {
    public static void main(String[] args) {
        ClassePai classePai = new ClasseFilhaQueQuebra();
        ClasseFilhaDireita classeFilhaDireita = new ClasseFilhaDireita();
        ClasseFilhaQueQuebra classeFilhaQueQuebra= new ClasseFilhaQueQuebra();

       System.out.println(classePai.calcular(1000.0,  100.0, 700.0));
      // System.out.println(classeFilhaDireita.calcular(1500.0,700.0, 50.0));
      //  System.out.println(classeFilhaQueQuebra.calcular(1500.0,900.0, 1001.0));



    }
}