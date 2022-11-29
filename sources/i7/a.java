package i7;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: i7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0463a {
        void a(Bitmap bitmap);

        byte[] b(int i10);

        Bitmap c(int i10, int i11, Bitmap.Config config);

        int[] d(int i10);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    void a();

    int b();

    void c(Bitmap.Config config);

    void clear();

    int d();

    void e();

    ByteBuffer f();

    int g();

    Bitmap getNextFrame();

    int h();
}
