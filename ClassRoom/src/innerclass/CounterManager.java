package innerclass;

public class CounterManager {
	void countUp(int maxCount) {
		class Counter {
			void count() {
				for (int i = 1; i <= maxCount; i++) {
					System.out.println("Count: " + i);
				}
			}
		}

		Counter counter = new Counter();
		counter.count();
	}
}
