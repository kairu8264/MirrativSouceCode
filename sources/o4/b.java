package o4;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f44059a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0654b<D> f44060b;

    /* renamed from: c  reason: collision with root package name */
    public a<D> f44061c;

    /* renamed from: d  reason: collision with root package name */
    public Context f44062d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44063e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f44064f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f44065g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f44066h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f44067i = false;

    /* loaded from: classes.dex */
    public interface a<D> {
        void a(b<D> bVar);
    }

    /* renamed from: o4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0654b<D> {
        void a(b<D> bVar, D d10);
    }

    public b(Context context) {
        this.f44062d = context.getApplicationContext();
    }

    public void a() {
        this.f44064f = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f44067i = false;
    }

    public String d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        n3.b.a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void e() {
        a<D> aVar = this.f44061c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void f(D d10) {
        InterfaceC0654b<D> interfaceC0654b = this.f44060b;
        if (interfaceC0654b != null) {
            interfaceC0654b.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f44059a);
        printWriter.print(" mListener=");
        printWriter.println(this.f44060b);
        if (this.f44063e || this.f44066h || this.f44067i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f44063e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f44066h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f44067i);
        }
        if (this.f44064f || this.f44065g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f44064f);
            printWriter.print(" mReset=");
            printWriter.println(this.f44065g);
        }
    }

    public void h() {
        n();
    }

    public Context i() {
        return this.f44062d;
    }

    public boolean j() {
        return this.f44064f;
    }

    public void k() {
    }

    public boolean l() {
        throw null;
    }

    public void m() {
        if (this.f44063e) {
            h();
        } else {
            this.f44066h = true;
        }
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
        throw null;
    }

    public void q() {
        throw null;
    }

    public void r(int i10, InterfaceC0654b<D> interfaceC0654b) {
        if (this.f44060b == null) {
            this.f44060b = interfaceC0654b;
            this.f44059a = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void s() {
        o();
        this.f44065g = true;
        this.f44063e = false;
        this.f44064f = false;
        this.f44066h = false;
        this.f44067i = false;
    }

    public void t() {
        if (this.f44067i) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        n3.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f44059a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f44063e = true;
        this.f44065g = false;
        this.f44064f = false;
        p();
    }

    public void v() {
        this.f44063e = false;
        q();
    }

    public void w(InterfaceC0654b<D> interfaceC0654b) {
        InterfaceC0654b<D> interfaceC0654b2 = this.f44060b;
        if (interfaceC0654b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0654b2 == interfaceC0654b) {
            this.f44060b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
