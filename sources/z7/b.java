package z7;

import android.graphics.Bitmap;
import i7.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0463a {

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f62605a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.b f62606b;

    public b(p7.e eVar, p7.b bVar) {
        this.f62605a = eVar;
        this.f62606b = bVar;
    }

    @Override // i7.a.InterfaceC0463a
    public void a(Bitmap bitmap) {
        this.f62605a.c(bitmap);
    }

    @Override // i7.a.InterfaceC0463a
    public byte[] b(int i10) {
        p7.b bVar = this.f62606b;
        if (bVar == null) {
            return new byte[i10];
        }
        return (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // i7.a.InterfaceC0463a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f62605a.e(i10, i11, config);
    }

    @Override // i7.a.InterfaceC0463a
    public int[] d(int i10) {
        p7.b bVar = this.f62606b;
        if (bVar == null) {
            return new int[i10];
        }
        return (int[]) bVar.c(i10, int[].class);
    }

    @Override // i7.a.InterfaceC0463a
    public void e(byte[] bArr) {
        p7.b bVar = this.f62606b;
        if (bVar == null) {
            return;
        }
        bVar.e(bArr);
    }

    @Override // i7.a.InterfaceC0463a
    public void f(int[] iArr) {
        p7.b bVar = this.f62606b;
        if (bVar == null) {
            return;
        }
        bVar.e(iArr);
    }
}
