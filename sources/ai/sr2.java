package ai;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class sr2 extends or2 {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f9925i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    public final qr2 f9926a;

    /* renamed from: b  reason: collision with root package name */
    public final pr2 f9927b;

    /* renamed from: d  reason: collision with root package name */
    public ot2 f9929d;

    /* renamed from: e  reason: collision with root package name */
    public rs2 f9930e;

    /* renamed from: c  reason: collision with root package name */
    public final List<gs2> f9928c = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f9931f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9932g = false;

    /* renamed from: h  reason: collision with root package name */
    public final String f9933h = UUID.randomUUID().toString();

    public sr2(pr2 pr2Var, qr2 qr2Var) {
        this.f9927b = pr2Var;
        this.f9926a = qr2Var;
        k(null);
        if (qr2Var.i() != rr2.HTML && qr2Var.i() != rr2.JAVASCRIPT) {
            this.f9930e = new us2(qr2Var.e(), null);
        } else {
            this.f9930e = new ss2(qr2Var.f());
        }
        this.f9930e.a();
        ds2.a().b(this);
        js2.a().b(this.f9930e.d(), pr2Var.b());
    }

    @Override // ai.or2
    public final void a() {
        if (this.f9931f) {
            return;
        }
        this.f9931f = true;
        ds2.a().c(this);
        this.f9930e.j(ks2.a().f());
        this.f9930e.h(this, this.f9926a);
    }

    @Override // ai.or2
    public final void b(View view) {
        if (this.f9932g || i() == view) {
            return;
        }
        k(view);
        this.f9930e.k();
        Collection<sr2> e10 = ds2.a().e();
        if (e10 == null || e10.size() <= 0) {
            return;
        }
        for (sr2 sr2Var : e10) {
            if (sr2Var != this && sr2Var.i() == view) {
                sr2Var.f9929d.clear();
            }
        }
    }

    @Override // ai.or2
    public final void c() {
        if (this.f9932g) {
            return;
        }
        this.f9929d.clear();
        if (!this.f9932g) {
            this.f9928c.clear();
        }
        this.f9932g = true;
        js2.a().d(this.f9930e.d());
        ds2.a().d(this);
        this.f9930e.b();
        this.f9930e = null;
    }

    @Override // ai.or2
    public final void d(View view, ur2 ur2Var, String str) {
        gs2 gs2Var;
        if (this.f9932g) {
            return;
        }
        if (f9925i.matcher("Ad overlay").matches()) {
            Iterator<gs2> it = this.f9928c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gs2Var = null;
                    break;
                }
                gs2Var = it.next();
                if (gs2Var.a().get() == view) {
                    break;
                }
            }
            if (gs2Var == null) {
                this.f9928c.add(new gs2(view, ur2Var, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    public final List<gs2> f() {
        return this.f9928c;
    }

    public final rs2 g() {
        return this.f9930e;
    }

    public final String h() {
        return this.f9933h;
    }

    public final View i() {
        return this.f9929d.get();
    }

    public final boolean j() {
        return this.f9931f && !this.f9932g;
    }

    public final void k(View view) {
        this.f9929d = new ot2(view);
    }
}
