import java.util.Scanner;
public class bonus1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
       

/*Especificações de entrada e saída :

     Entrada : a entrada deve ser lida da entrada-padrão. A entrada será de apenas uma linha e é composta por duas partes, separadas por um caracter branco . A primeira parte é a palavra a ser procurada e a segunda parte consiste no texto a ser inspecionado. É pressuposto que :

não há caracteres brancos dentro da palavra e nem dentro do texto.
o tamanho da palavra sempre será menor que o tamanho do texto.
o texto nunca irá exceder 120 caracteres.
     Saída : a saída deve ser escrita na saída-padrão.  Ela deverá ser composta de 3 elementos : <n> <m> <c>, separados por um branco, onde :

<n> : número de ocorrências da palavra dentro do texto no sentido normal (da esquerda para direita)            

<m> : número de ocorrências da palavra dentro do texto no sentido inverso (da direita para esquerda)

<c> : caracter de 1 posição que valerá  '*'   ou  '-' .  Ele será  '*' caso o número de vogais seja igual ao de consoantes dentro da palavra de entrada. E valerá  '-'  caso contrário.

      atenção :  a linha de saída não deverá ser seguida de \n  , ou seja, não deverá terminar com newline.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

     EXEMPLO de entrada : 

,

A palavra de entrada "fita" deverá ser pesquisada no texto acima, tanto no sentido normal (da esquerda para direita) como de trás para diante.

A saída que o programa deverá gerar será :

2 1 *

2 => número de ocorrências da palavra de entrada "fita" lida no sentido normal

1 => número de ocorrências da palavra de entrada "fita" lida no sentido inverso

* => valerá '*' pois a palavra de entrada "fita" possui o número de vogais igual ao número de consoantes.*/    

/*Dicas :

Você precisará converter cada String lida num vetor de caracteres. Um caractere é usualmente armazenado em variáveis do tipo char. 

Por exemplo, podemos fazer 

    char c = 'X'; 

Note o uso de aspas simples envolvendo o caractere 'X'. Aspas duplas são reservadas para valores 

literais do tipo String e aspas simples para valores literais do tipo char.*/
        //Leitura de entradas
        String palavra = teclado.next();
        char letrasp[] = palavra.toCharArray();
        String frase = teclado.next();
        char letrasf[] = frase.toCharArray();
        int cnt_direta = 0; int cnt_contra = 0; int let_ig = 0; 
        
        /*for(int i = 0;i<letrasp.length;i++){
            System.out.print(letrasp[i]+" ");
        }
        System.out.println();
        
        for(int i = 0;i<letrasf.length;i++){
            System.out.print(letrasf[i]+" ");
        }
        System.out.println();*/
        
        //Contagem de vogais e consoantes
        char vogais[] = {'a','e','i','o','u'};
        int cnt_vog = 0; int cntfls = 0;
        int cnt_cns = 0;
        for(int i = 0;i<letrasp.length;i++){
            for(int j = 0;j<vogais.length;j++){
                if(letrasp[i]==vogais[j]){
                    cnt_vog++;
                    cntfls = 0;
                    break;
                    
                }
                else{
                    cntfls++;
                }
                /*if (cntfls==5){
                cnt_cns++;
                cntfls = 0;
                }*/
            }
            if (cntfls==5){
                cnt_cns++;
                cntfls = 0;
            }
        }
        char c;
        if (cnt_cns==cnt_vog)
            c = '*';
        else 
            c = '-';
        //Sentido direto
        for(int i = 0;i<letrasf.length;i++){
            int z = 0;
            for(int j = 0;j<letrasp.length;j++){
                if (letrasp[j]==letrasf[i+z]){
                    let_ig++;
                    z++;
                }
                else {
                    let_ig=0;
                    z = 0;
                }
                if (let_ig == letrasp.length){
                    cnt_direta++;
                    let_ig = 0;
                    break;
                }
            }
        }
        // Sentido contrario
        for(int i = (letrasf.length-1);i>0;i--){
            int z = 0;
            for(int j = 0;j<letrasp.length;j++){
                if (letrasp[j]==letrasf[i-z]){
                    let_ig++;
                    z++;
                }
                else {
                    let_ig=0;
                    z = 0;
                }
                if (let_ig == letrasp.length){
                    cnt_contra++;
                    let_ig = 0;
                    break;
                }
            }
                    
        }
        System.out.print(cnt_direta+" ");
        System.out.print(cnt_contra+" ");
        //System.out.print(cnt_cns+" ");
        //System.out.print(cnt_vog+" ");
        //System.out.print(cntfls+" ");
        System.out.print(c);
    }
}