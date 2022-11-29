package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import xi.h;

/* loaded from: classes3.dex */
public interface b {
    void a();

    h b();

    boolean c();

    void d();

    void e();

    AnimatorSet f();

    void g(h hVar);

    List<Animator.AnimatorListener> h();

    void i(ExtendedFloatingActionButton.f fVar);

    void onAnimationStart(Animator animator);
}
