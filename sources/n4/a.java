package n4;

import android.os.Bundle;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: n4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0614a<D> {
        o4.b<D> G1(int i10, Bundle bundle);

        void i0(o4.b<D> bVar, D d10);

        void t2(o4.b<D> bVar);
    }

    public static <T extends u & v0> a c(T t10) {
        return new b(t10, t10.U());
    }

    public abstract void a(int i10);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> o4.b<D> d(int i10, Bundle bundle, InterfaceC0614a<D> interfaceC0614a);

    public abstract void e();
}
