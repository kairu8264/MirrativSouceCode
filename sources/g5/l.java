package g5;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f32738a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f32739b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.f32716c);
    }

    public static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.f32716c, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f32738a) != this || (runnable = this.f32739b) == null) {
            return;
        }
        runnable.run();
    }
}
