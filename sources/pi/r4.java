package pi;

import hi.af;
import java.util.List;

/* loaded from: classes3.dex */
public final class r4 implements af {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t4 f48189a;

    public r4(t4 t4Var) {
        this.f48189a = t4Var;
    }

    @Override // hi.af
    public final void a(int i10, String str, List<String> list, boolean z10, boolean z11) {
        o3 o10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            o10 = this.f48189a.f48285a.r().o();
        } else if (i11 != 1) {
            if (i11 == 3) {
                o10 = this.f48189a.f48285a.r().u();
            } else if (i11 != 4) {
                o10 = this.f48189a.f48285a.r().t();
            } else if (z10) {
                o10 = this.f48189a.f48285a.r().x();
            } else if (!z11) {
                o10 = this.f48189a.f48285a.r().w();
            } else {
                o10 = this.f48189a.f48285a.r().v();
            }
        } else if (z10) {
            o10 = this.f48189a.f48285a.r().s();
        } else if (!z11) {
            o10 = this.f48189a.f48285a.r().q();
        } else {
            o10 = this.f48189a.f48285a.r().p();
        }
        int size = list.size();
        if (size == 1) {
            o10.b(str, list.get(0));
        } else if (size == 2) {
            o10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            o10.a(str);
        } else {
            o10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
