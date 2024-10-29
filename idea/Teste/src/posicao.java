public class posicao {
    int[]numero;
    int maior;
    int menor;

    public static void maiormenor(){
        int[]numero={0,2,3,4,5,6,7,8,9,10};
        int maior=0;
        int menor=0;

        for (int i = 0; i<10; i++){
            if (numero[i]>maior){
                maior=numero[i];
            }

            if (numero[i]<menor){
                menor=numero[i];
            }
        }

        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
