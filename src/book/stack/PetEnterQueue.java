package book.stack;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 9:39
 * @desc
 **/
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEntertype() {
        return this.pet.getPetType();
    }
}

class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getPetType() {
        return this.type;
    }
}

class Dog extends Pet {
    public Dog() {
        super("Dog");
    }
}

class Cat extends Pet {
    public Cat() {
        super("Cat");
    }
}