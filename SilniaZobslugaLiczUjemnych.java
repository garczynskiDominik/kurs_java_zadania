package pl.garczynski;

public  class SilniaZobslugaLiczUjemnych {
    public static void main(String[] args) {
       try {
           System.out.println(silnia(5));
           System.out.println(silnia(-5));
       } catch (WrongValueForSilniaException e){
           System.out.println("Blad " + e.getMessage());
       }
    }
public static int silnia(int n)
       throws WrongValueForSilniaException {
        if (n <0) {
            throw new WrongValueForSilniaException(
                    "Silnia moze byc z liczby dodatniej");
        }
        int result = 1;
       for (int i = 1; i <= n; i++) {
           result  *= i;
       }
       return result;
    }
}
