package teste.com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CutOffTrees {
	private static final int[][] DIRECTIONS = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public int cutOffTree(List<List<Integer>> forest) {
		if (forest == null || forest.size() == 0 || forest.get(0).size() == 0) {
			return -1;
		}

		int m = forest.size();
		int n = forest.get(0).size();
		List<int[]> trees = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int height = forest.get(i).get(j);
				if (height > 1) {
					trees.add(new int[] { height, i, j });
				}
			}
		}

		Collections.sort(trees, (a, b) -> Integer.compare(a[0], b[0]));

		int startX = 0, startY = 0;
		int totalSteps = 0;

		for (int[] tree : trees) {
			int targetX = tree[1];
			int targetY = tree[2];

			int steps = bfs(forest, startX, startY, targetX, targetY);

			if (steps == -1) {
				return -1; // 
			}

			totalSteps += steps;
			startX = targetX;
			startY = targetY;
		}

		return totalSteps;
	}

	private int bfs(List<List<Integer>> forest, int startX, int startY, int targetX, int targetY) {
		int m = forest.size();
		int n = forest.get(0).size();

		boolean[][] visited = new boolean[m][n];
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { startX, startY });
		visited[startX][startY] = true;

		int steps = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				int[] current = queue.poll();
				int x = current[0], y = current[1];

				if (x == targetX && y == targetY) {
					return steps;
				}

				for (int[] direction : DIRECTIONS) {
					int newX = x + direction[0];
					int newY = y + direction[1];

					if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]
							&& forest.get(newX).get(newY) > 0) {

						queue.add(new int[] { newX, newY });
						visited[newX][newY] = true;
					}
				}
			}

			steps++;
		}

		return -1; 
	}

	public static void main(String[] args) {
		CutOffTrees solution = new CutOffTrees();

		// Exemplo 1
		List<List<Integer>> forest1 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 4),
				Arrays.asList(7, 6, 5));
		System.out.println(solution.cutOffTree(forest1)); // Saída: 6

		// Exemplo 2
		List<List<Integer>> forest2 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 0),
				Arrays.asList(7, 6, 5));
		System.out.println(solution.cutOffTree(forest2)); // Saída: -1

		// Exemplo 3
		List<List<Integer>> forest3 = Arrays.asList(Arrays.asList(2, 3, 4), Arrays.asList(0, 0, 5),
				Arrays.asList(8, 7, 6));
		System.out.println(solution.cutOffTree(forest3)); // Saída: 6
	}
}
