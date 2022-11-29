package i7;

import android.util.Log;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f36384b;

    /* renamed from: c  reason: collision with root package name */
    public c f36385c;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f36383a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f36386d = 0;

    public void a() {
        this.f36384b = null;
        this.f36385c = null;
    }

    public final boolean b() {
        return this.f36385c.f36371b != 0;
    }

    public c c() {
        if (this.f36384b != null) {
            if (b()) {
                return this.f36385c;
            }
            k();
            if (!b()) {
                h();
                c cVar = this.f36385c;
                if (cVar.f36372c < 0) {
                    cVar.f36371b = 1;
                }
            }
            return this.f36385c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int d() {
        try {
            return this.f36384b.get() & TagConstant.TAG_CAT_RESERVED;
        } catch (Exception unused) {
            this.f36385c.f36371b = 1;
            return 0;
        }
    }

    public final void e() {
        this.f36385c.f36373d.f36359a = n();
        this.f36385c.f36373d.f36360b = n();
        this.f36385c.f36373d.f36361c = n();
        this.f36385c.f36373d.f36362d = n();
        int d10 = d();
        boolean z10 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        b bVar = this.f36385c.f36373d;
        bVar.f36363e = (d10 & 64) != 0;
        if (z10) {
            bVar.f36369k = g(pow);
        } else {
            bVar.f36369k = null;
        }
        this.f36385c.f36373d.f36368j = this.f36384b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f36385c;
        cVar.f36372c++;
        cVar.f36374e.add(cVar.f36373d);
    }

    public final void f() {
        int d10 = d();
        this.f36386d = d10;
        if (d10 <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f36386d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f36384b.get(this.f36383a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f36386d, e10);
                }
                this.f36385c.f36371b = 1;
                return;
            }
        }
    }

    public final int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f36384b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & TagConstant.TAG_CAT_RESERVED) << 16) | (-16777216) | ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[i14] & TagConstant.TAG_CAT_RESERVED);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f36385c.f36371b = 1;
        }
        return iArr;
    }

    public final void h() {
        i(Integer.MAX_VALUE);
    }

    public final void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f36385c.f36372c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f36385c.f36373d = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f36383a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f36385c;
                if (cVar.f36373d == null) {
                    cVar.f36373d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f36385c.f36371b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void j() {
        d();
        int d10 = d();
        b bVar = this.f36385c.f36373d;
        int i10 = (d10 & 28) >> 2;
        bVar.f36365g = i10;
        if (i10 == 0) {
            bVar.f36365g = 1;
        }
        bVar.f36364f = (d10 & 1) != 0;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f36385c.f36373d;
        bVar2.f36367i = n10 * 10;
        bVar2.f36366h = d();
        d();
    }

    public final void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f36385c.f36371b = 1;
            return;
        }
        l();
        if (!this.f36385c.f36377h || b()) {
            return;
        }
        c cVar = this.f36385c;
        cVar.f36370a = g(cVar.f36378i);
        c cVar2 = this.f36385c;
        cVar2.f36381l = cVar2.f36370a[cVar2.f36379j];
    }

    public final void l() {
        this.f36385c.f36375f = n();
        this.f36385c.f36376g = n();
        int d10 = d();
        c cVar = this.f36385c;
        cVar.f36377h = (d10 & 128) != 0;
        cVar.f36378i = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f36385c.f36379j = d();
        this.f36385c.f36380k = d();
    }

    public final void m() {
        do {
            f();
            byte[] bArr = this.f36383a;
            if (bArr[0] == 1) {
                this.f36385c.f36382m = ((bArr[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[1] & TagConstant.TAG_CAT_RESERVED);
            }
            if (this.f36386d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int n() {
        return this.f36384b.getShort();
    }

    public final void o() {
        this.f36384b = null;
        Arrays.fill(this.f36383a, (byte) 0);
        this.f36385c = new c();
        this.f36386d = 0;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f36384b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f36384b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
        int d10;
        do {
            d10 = d();
            this.f36384b.position(Math.min(this.f36384b.position() + d10, this.f36384b.limit()));
        } while (d10 > 0);
    }

    public final void r() {
        d();
        q();
    }
}
