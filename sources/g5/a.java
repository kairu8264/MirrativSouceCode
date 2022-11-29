package g5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0377a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    public static void b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                Animator.AnimatorListener animatorListener = listeners.get(i10);
                if (animatorListener instanceof InterfaceC0377a) {
                    ((InterfaceC0377a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    public static void c(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                Animator.AnimatorListener animatorListener = listeners.get(i10);
                if (animatorListener instanceof InterfaceC0377a) {
                    ((InterfaceC0377a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
