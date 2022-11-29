package ai;

import com.google.android.gms.internal.ads.zzdd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class lv1 implements u71 {

    /* renamed from: b  reason: collision with root package name */
    public t51 f6695b;

    /* renamed from: c  reason: collision with root package name */
    public t51 f6696c;

    /* renamed from: d  reason: collision with root package name */
    public t51 f6697d;

    /* renamed from: e  reason: collision with root package name */
    public t51 f6698e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f6699f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f6700g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6701h;

    public lv1() {
        ByteBuffer byteBuffer = u71.f10618a;
        this.f6699f = byteBuffer;
        this.f6700g = byteBuffer;
        t51 t51Var = t51.f10147e;
        this.f6697d = t51Var;
        this.f6698e = t51Var;
        this.f6695b = t51Var;
        this.f6696c = t51Var;
    }

    @Override // ai.u71
    public boolean a() {
        return this.f6701h && this.f6700g == u71.f10618a;
    }

    @Override // ai.u71
    public final t51 b(t51 t51Var) throws zzdd {
        this.f6697d = t51Var;
        this.f6698e = j(t51Var);
        return zzb() ? this.f6698e : t51.f10147e;
    }

    @Override // ai.u71
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f6700g;
        this.f6700g = u71.f10618a;
        return byteBuffer;
    }

    @Override // ai.u71
    public final void d() {
        this.f6701h = true;
        k();
    }

    @Override // ai.u71
    public final void e() {
        f();
        this.f6699f = u71.f10618a;
        t51 t51Var = t51.f10147e;
        this.f6697d = t51Var;
        this.f6698e = t51Var;
        this.f6695b = t51Var;
        this.f6696c = t51Var;
        m();
    }

    @Override // ai.u71
    public final void f() {
        this.f6700g = u71.f10618a;
        this.f6701h = false;
        this.f6695b = this.f6697d;
        this.f6696c = this.f6698e;
        l();
    }

    public final ByteBuffer h(int i10) {
        if (this.f6699f.capacity() < i10) {
            this.f6699f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6699f.clear();
        }
        ByteBuffer byteBuffer = this.f6699f;
        this.f6700g = byteBuffer;
        return byteBuffer;
    }

    public final boolean i() {
        return this.f6700g.hasRemaining();
    }

    public abstract t51 j(t51 t51Var) throws zzdd;

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    @Override // ai.u71
    public boolean zzb() {
        return this.f6698e != t51.f10147e;
    }
}
