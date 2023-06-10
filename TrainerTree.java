package PokePal_Proje;



class TrainerTree {
    private TrainerNode root;

    public TrainerTree() {
        
    	root = null;
    }

    public void addTrainer(Trainer trainer) {
        if (root == null) {
            root = new TrainerNode(trainer);
        } else {
            addTrainerHelper(root, trainer);
        }
    }

    private void addTrainerHelper(TrainerNode current, Trainer trainer) {
        if (trainer.getName().compareToIgnoreCase(current.getTrainer().getName()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new TrainerNode(trainer));
            } else {
                addTrainerHelper(current.getLeft(), trainer);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(new TrainerNode(trainer));
            } else {
                addTrainerHelper(current.getRight(), trainer);
            }
        }
    }
    public TrainerNode getRoot() {
        return root;
    }
   
    public String searchTrainer(String name) {
        TrainerNode foundNode = searchTrainerHelper(root, name);
        if (foundNode != null) {
            foundNode.getTrainer().displayTeam();
            return "";
        } else {
            return "Trainer not found.";
        }
    }//searchtrainer

    private TrainerNode searchTrainerHelper(TrainerNode current, String name) {
        if (current == null || current.getTrainer().getName().equalsIgnoreCase(name)) {
           
            return current;
        }                                      

        if (name.compareToIgnoreCase(current.getTrainer().getName()) < 0) {
           
            return searchTrainerHelper(current.getLeft(), name);
        } else {
           
            return searchTrainerHelper(current.getRight(), name);
        }
    }//searchtrainerhelper

    public void removeTrainer(String name) {
        root = removeTrainerHelper(root, name);
    }

    private TrainerNode removeTrainerHelper(TrainerNode current, String name) {
        if (current == null) {
            return null;
        }//trainerremove

        int compareResult = name.compareToIgnoreCase(current.getTrainer().getName());
        if (compareResult < 0) {
            current.setLeft(removeTrainerHelper(current.getLeft(), name));
        } else if (compareResult > 0) {
            current.setRight(removeTrainerHelper(current.getRight(), name));
        } else {
           
            if (current.getLeft() == null && current.getRight() == null) {
              
                return null;
            } else if (current.getLeft() == null) {
                
                return current.getRight();
            } else if (current.getRight() == null) {
               
                return current.getLeft();
            } else {
               
                TrainerNode successor = findMinimumNode(current.getRight());
                current.setTrainer(successor.getTrainer());
                current.setRight(removeTrainerHelper(current.getRight(), successor.getTrainer().getName()));
            }
        }
        return current;
    }//removehelp

    private TrainerNode findMinimumNode(TrainerNode current) {
        if (current.getLeft() == null) {
            return current;
        }
        return findMinimumNode(current.getLeft());
    }//find min



}//class
