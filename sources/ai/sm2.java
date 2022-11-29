package ai;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class sm2 {
    public static ParcelFileDescriptor a(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        hk0.f4878a.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: ai.rm2

            /* renamed from: w  reason: collision with root package name */
            public final InputStream f9503w;

            /* renamed from: x  reason: collision with root package name */
            public final ParcelFileDescriptor f9504x;

            {
                this.f9503w = inputStream;
                this.f9504x = parcelFileDescriptor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = this.f9503w;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f9504x);
                    try {
                        vh.l.b(inputStream2, autoCloseOutputStream);
                        autoCloseOutputStream.close();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (Throwable th3) {
                            ug3.a(th2, th3);
                        }
                        throw th2;
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
