package com.github.danilodant.java;

import java.util.stream.Stream;

public class JavaStringTokens {

  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // String s = scan.nextLine();
    // scan.close();
    String s = "Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,        ";
    // Write your code here.

    if (s.trim().isEmpty()) {
      String[] tokens = s.trim().split("[^a-zA-Z]+");
      System.out.println(tokens.length);
      Stream.of(tokens).forEach(System.out::println);
    } else {
      System.out.println(0);
    }
  }
}
