class VargsPassing {
    // static void ShowList(String ...S) {
    //     for(int i=0;i<S.length;i++) {
    //         System.out.println(i+1+". "+S[i]); // ek baar me ek word(space) lerha hai //
    //     }
    // }
    static void ShowList(int start,String ...S) {
        for(int i=0;i<S.length;i++) {
            System.out.println(start+". "+S[i]); // ek baar me ek word(space) lerha hai //
            start++;
        }
    }
    public static void main(String ...args) {
        ShowList(5,"John","Rakesh","Naruto","Kakashi Hatake","Uchicha Madara");
    }
}