
package math;


public class PrimeNumber {
    int number=5;

    public PrimeNumber() {
    }
    public PrimeNumber(int newNumber) {
        number=newNumber;
    }
    
    public String checkPrime(){
       int count=0;
    for(int i=1; i<=number;i++){
    if(number%i==0){
        count ++;
    }
    }
    if(count==2){
      return "this is prime number";
    }
    else{return "not prime number";}
    
    }
    
    
}
