package lv.tsi.exercise_4;

class ProducerConsumerMain {

    public static void main(String[] args) {
        var goods = new Goods();

        var producer = new Producer(goods);
        var consumer = new Consumer(goods);

        producer.start();
        consumer.start();
    }
}
