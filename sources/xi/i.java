package xi;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public long f60312a;

    /* renamed from: b  reason: collision with root package name */
    public long f60313b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f60314c;

    /* renamed from: d  reason: collision with root package name */
    public int f60315d;

    /* renamed from: e  reason: collision with root package name */
    public int f60316e;

    public i(long j10, long j11) {
        this.f60312a = 0L;
        this.f60313b = 300L;
        this.f60314c = null;
        this.f60315d = 0;
        this.f60316e = 1;
        this.f60312a = j10;
        this.f60313b = j11;
    }

    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f60315d = valueAnimator.getRepeatCount();
        iVar.f60316e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f60299c;
            }
            return interpolator instanceof DecelerateInterpolator ? a.f60300d : interpolator;
        }
        return a.f60298b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f60312a;
    }

    public long d() {
        return this.f60313b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f60314c;
        return timeInterpolator != null ? timeInterpolator : a.f60298b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
                return e().getClass().equals(iVar.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.f60315d;
    }

    public int h() {
        return this.f60316e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f60312a = 0L;
        this.f60313b = 300L;
        this.f60314c = null;
        this.f60315d = 0;
        this.f60316e = 1;
        this.f60312a = j10;
        this.f60313b = j11;
        this.f60314c = timeInterpolator;
    }
}
