package intro.divingdeeper;

public class DifferentSymbolsNaive {
  int differentSymbolsNaive(String s) {
    return (int) s.chars().distinct().count();
  }
}
