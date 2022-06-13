package com.survival2d.app.game.utils;

import com.tvd12.gamebox.math.Vec3;

public class InputUtils {
	public static Vec3 ComputeMovementFromInput(boolean upInput, boolean leftInput,
	                                            boolean downInput, boolean rightInput) {
		Vec3 answer = new Vec3();
		if (upInput) {
			answer.add(Vec3.forward);
		}
		if (leftInput) {
			answer.add(Vec3.left);
		}
		if (downInput) {
			answer.add(Vec3.backward);
		}
		if (rightInput) {
			answer.add(Vec3.right);
		}
		return answer;
	}
}