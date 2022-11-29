package n1;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final List<w> f41456a;

    /* renamed from: b  reason: collision with root package name */
    public final g f41457b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41458c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41459d;

    /* renamed from: e  reason: collision with root package name */
    public int f41460e;

    public m(List<w> list, g gVar) {
        jo.p.h(list, "changes");
        this.f41456a = list;
        this.f41457b = gVar;
        MotionEvent e10 = e();
        this.f41458c = l.a(e10 != null ? e10.getButtonState() : 0);
        MotionEvent e11 = e();
        this.f41459d = i0.a(e11 != null ? e11.getMetaState() : 0);
        this.f41460e = a();
    }

    public final int a() {
        MotionEvent e10 = e();
        if (e10 != null) {
            int actionMasked = e10.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return p.f41507a.f();
                            case 9:
                                return p.f41507a.a();
                            case 10:
                                return p.f41507a.b();
                            default:
                                return p.f41507a.g();
                        }
                    }
                    return p.f41507a.c();
                }
                return p.f41507a.e();
            }
            return p.f41507a.d();
        }
        List<w> list = this.f41456a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            if (n.d(wVar)) {
                return p.f41507a.e();
            }
            if (n.b(wVar)) {
                return p.f41507a.d();
            }
        }
        return p.f41507a.c();
    }

    public final int b() {
        return this.f41458c;
    }

    public final List<w> c() {
        return this.f41456a;
    }

    public final g d() {
        return this.f41457b;
    }

    public final MotionEvent e() {
        g gVar = this.f41457b;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    public final int f() {
        return this.f41460e;
    }

    public final void g(int i10) {
        this.f41460e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(List<w> list) {
        this(list, null);
        jo.p.h(list, "changes");
    }
}
