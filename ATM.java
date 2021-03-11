public class ATM {
    public int countBanknotes(int sum) {
      int count = 0;
      int[] banknotes = {500,200,100,50,20,10,5,2,1};
      int rest = sum;
      int i = 0;
      while (rest > 0 && i < banknotes.length) {
          count += rest/banknotes[i];
          rest -= rest/banknotes[i] * banknotes[i];
          i++;
      }
      return count;
    }
}
