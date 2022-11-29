package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class v60 implements r30<l70> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j70 f10983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e60 f10984b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k70 f10985c;

    public v60(k70 k70Var, j70 j70Var, e60 e60Var) {
        this.f10985c = k70Var;
        this.f10983a = j70Var;
        this.f10984b = e60Var;
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(l70 l70Var, Map map) {
        Object obj;
        obj = this.f10985c.f6106a;
        synchronized (obj) {
            if (this.f10983a.e() != -1 && this.f10983a.e() != 1) {
                this.f10985c.f6113h = 0;
                e60 e60Var = this.f10984b;
                e60Var.x0("/log", q30.f8785g);
                e60Var.x0("/result", q30.f8793o);
                this.f10983a.c(this.f10984b);
                this.f10985c.f6112g = this.f10983a;
                yg.p1.k("Successfully loaded JS Engine.");
            }
        }
    }
}
