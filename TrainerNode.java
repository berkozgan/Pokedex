package PokePal_Proje;


class TrainerNode {
    private Trainer trainer;
    private TrainerNode left;
    private TrainerNode right;

    public TrainerNode(Trainer trainer) {
        this.trainer = trainer;
        this.left = null;
        this.right = null;
    }

    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public TrainerNode getLeft() {
        return left;
    }

    public TrainerNode getRight() {
        return right;
    }

    public void setLeft(TrainerNode left) {
        this.left = left;
    }

    public void setRight(TrainerNode right) {
        this.right = right;
    }
}
