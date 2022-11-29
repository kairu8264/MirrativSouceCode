package nj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f43630a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f43631b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f43632c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f43633d = new a();

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f43632c == animator) {
                fVar.f43632c = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f43635a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f43636b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f43635a = iArr;
            this.f43636b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f43633d);
        this.f43630a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f43632c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43632c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.f43632c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f43632c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f43630a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f43630a.get(i10);
            if (StateSet.stateSetMatches(bVar.f43635a, iArr)) {
                break;
            }
            i10++;
        }
        b bVar2 = this.f43631b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f43631b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }

    public final void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f43636b;
        this.f43632c = valueAnimator;
        valueAnimator.start();
    }
}
