class Main {
    public static void main(String[] args) {
        Sac sac = new Sac();
        Chevalet chevalet = new Chevalet(sac);
        Plateau plateau = new Plateau(chevalet);

        plateau.afficherPlateau();
        plateau.afficherChevalet();
    }
}