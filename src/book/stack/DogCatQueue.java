package book.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 10:21
 * @desc 使用时间戳实现猫狗队列
 **/
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("Dog")) {
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        } else if (pet.getPetType().equals("Cat")) {
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        } else {
            throw new RuntimeException("not dog and cat");
        }
    }

    public Pet pollAll() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("error");
        }
    }

    public Pet pollDog() {
        if (!this.dogQ.isEmpty()) {
            return (Dog) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("error");
        }
    }

    public Pet pollCat() {
        if (!this.catQ.isEmpty()) {
            return (Cat) this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("error");
        }
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQEmpty(){
        return this.dogQ.isEmpty();
    }

    public boolean isCatQEmpty(){
        return this.catQ.isEmpty();
    }
}
