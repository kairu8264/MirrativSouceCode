package i7;

import android.graphics.Bitmap;
import android.util.Log;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import i7.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    public static final String f36387u = "e";

    /* renamed from: a  reason: collision with root package name */
    public int[] f36388a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f36389b;

    /* renamed from: c  reason: collision with root package name */
    public final a.InterfaceC0463a f36390c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f36391d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f36392e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f36393f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f36394g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f36395h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f36396i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f36397j;

    /* renamed from: k  reason: collision with root package name */
    public int f36398k;

    /* renamed from: l  reason: collision with root package name */
    public c f36399l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f36400m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f36401n;

    /* renamed from: o  reason: collision with root package name */
    public int f36402o;

    /* renamed from: p  reason: collision with root package name */
    public int f36403p;

    /* renamed from: q  reason: collision with root package name */
    public int f36404q;

    /* renamed from: r  reason: collision with root package name */
    public int f36405r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f36406s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f36407t;

    public e(a.InterfaceC0463a interfaceC0463a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0463a);
        q(cVar, byteBuffer, i10);
    }

    @Override // i7.a
    public void a() {
        this.f36398k = (this.f36398k + 1) % this.f36399l.f36372c;
    }

    @Override // i7.a
    public int b() {
        return this.f36399l.f36372c;
    }

    @Override // i7.a
    public void c(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f36407t = config;
    }

    @Override // i7.a
    public void clear() {
        this.f36399l = null;
        byte[] bArr = this.f36396i;
        if (bArr != null) {
            this.f36390c.e(bArr);
        }
        int[] iArr = this.f36397j;
        if (iArr != null) {
            this.f36390c.f(iArr);
        }
        Bitmap bitmap = this.f36400m;
        if (bitmap != null) {
            this.f36390c.a(bitmap);
        }
        this.f36400m = null;
        this.f36391d = null;
        this.f36406s = null;
        byte[] bArr2 = this.f36392e;
        if (bArr2 != null) {
            this.f36390c.e(bArr2);
        }
    }

    @Override // i7.a
    public int d() {
        int i10;
        if (this.f36399l.f36372c <= 0 || (i10 = this.f36398k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // i7.a
    public void e() {
        this.f36398k = -1;
    }

    @Override // i7.a
    public ByteBuffer f() {
        return this.f36391d;
    }

    @Override // i7.a
    public int g() {
        return this.f36398k;
    }

    @Override // i7.a
    public synchronized Bitmap getNextFrame() {
        if (this.f36399l.f36372c <= 0 || this.f36398k < 0) {
            String str = f36387u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f36399l.f36372c + ", framePointer=" + this.f36398k);
            }
            this.f36402o = 1;
        }
        int i10 = this.f36402o;
        if (i10 != 1 && i10 != 2) {
            this.f36402o = 0;
            if (this.f36392e == null) {
                this.f36392e = this.f36390c.b(255);
            }
            b bVar = this.f36399l.f36374e.get(this.f36398k);
            int i11 = this.f36398k - 1;
            b bVar2 = i11 >= 0 ? this.f36399l.f36374e.get(i11) : null;
            int[] iArr = bVar.f36369k;
            if (iArr == null) {
                iArr = this.f36399l.f36370a;
            }
            this.f36388a = iArr;
            if (iArr == null) {
                String str2 = f36387u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f36398k);
                }
                this.f36402o = 1;
                return null;
            }
            if (bVar.f36364f) {
                System.arraycopy(iArr, 0, this.f36389b, 0, iArr.length);
                int[] iArr2 = this.f36389b;
                this.f36388a = iArr2;
                iArr2[bVar.f36366h] = 0;
                if (bVar.f36365g == 2 && this.f36398k == 0) {
                    this.f36406s = Boolean.TRUE;
                }
            }
            return r(bVar, bVar2);
        }
        String str3 = f36387u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f36402o);
        }
        return null;
    }

    @Override // i7.a
    public int h() {
        return this.f36391d.limit() + this.f36396i.length + (this.f36397j.length * 4);
    }

    public final int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f36403p + i10; i18++) {
            byte[] bArr = this.f36396i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f36388a[bArr[i18] & TagConstant.TAG_CAT_RESERVED];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f36403p + i20; i21++) {
            byte[] bArr2 = this.f36396i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f36388a[bArr2[i21] & TagConstant.TAG_CAT_RESERVED];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    public final void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f36397j;
        int i15 = bVar.f36362d;
        int i16 = this.f36403p;
        int i17 = i15 / i16;
        int i18 = bVar.f36360b / i16;
        int i19 = bVar.f36361c / i16;
        int i20 = bVar.f36359a / i16;
        boolean z10 = this.f36398k == 0;
        int i21 = this.f36405r;
        int i22 = this.f36404q;
        byte[] bArr = this.f36396i;
        int[] iArr2 = this.f36388a;
        Boolean bool = this.f36406s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i24 < i17) {
            Boolean bool2 = bool;
            if (bVar.f36363e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 == 3) {
                        i26 = i27;
                        i23 = 4;
                        i25 = 2;
                    } else if (i27 != 4) {
                        i26 = i27;
                    } else {
                        i26 = i27;
                        i25 = 1;
                        i23 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar.f36361c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & TagConstant.TAG_CAT_RESERVED];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 < i31) {
                            int i39 = i(i33, i37, bVar.f36361c);
                            if (i39 != 0) {
                                iArr[i38] = i39;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i33 += i16;
                            i38++;
                            i19 = i13;
                        }
                    }
                    bool = bool2;
                    i24++;
                    i18 = i14;
                    i19 = i13;
                    i17 = i10;
                    i25 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i24++;
            i18 = i14;
            i19 = i13;
            i17 = i10;
            i25 = i12;
        }
        Boolean bool3 = bool;
        if (this.f36406s == null) {
            this.f36406s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    public final void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f36397j;
        int i10 = bVar2.f36362d;
        int i11 = bVar2.f36360b;
        int i12 = bVar2.f36361c;
        int i13 = bVar2.f36359a;
        boolean z10 = this.f36398k == 0;
        int i14 = this.f36405r;
        byte[] bArr = this.f36396i;
        int[] iArr2 = this.f36388a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f36361c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & TagConstant.TAG_CAT_RESERVED;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f36406s;
        this.f36406s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f36406s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f36391d.position(bVar.f36368j);
        }
        if (bVar == null) {
            c cVar = eVar.f36399l;
            i10 = cVar.f36375f;
            i11 = cVar.f36376g;
        } else {
            i10 = bVar.f36361c;
            i11 = bVar.f36362d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f36396i;
        if (bArr == null || bArr.length < i12) {
            eVar.f36396i = eVar.f36390c.b(i12);
        }
        byte[] bArr2 = eVar.f36396i;
        if (eVar.f36393f == null) {
            eVar.f36393f = new short[4096];
        }
        short[] sArr = eVar.f36393f;
        if (eVar.f36394g == null) {
            eVar.f36394g = new byte[4096];
        }
        byte[] bArr3 = eVar.f36394g;
        if (eVar.f36395h == null) {
            eVar.f36395h = new byte[4097];
        }
        byte[] bArr4 = eVar.f36395h;
        int p10 = p();
        int i13 = 1 << p10;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = p10 + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f36392e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = o();
                if (i23 <= 0) {
                    eVar.f36402o = 3;
                    break;
                }
                i24 = 0;
            }
            i26 += (bArr5[i24] & TagConstant.TAG_CAT_RESERVED) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i21;
            int i33 = i30;
            int i34 = i20;
            int i35 = i16;
            int i36 = i29;
            while (true) {
                if (i31 < i34) {
                    i20 = i34;
                    i21 = i32;
                    i25 = i31;
                    eVar = this;
                    i29 = i36;
                    i16 = i35;
                    i30 = i33;
                    break;
                }
                int i37 = i15;
                int i38 = i26 & i22;
                i26 >>= i34;
                i31 -= i34;
                if (i38 == i13) {
                    i22 = i17;
                    i34 = i35;
                    i32 = i37;
                    i15 = i32;
                    i33 = -1;
                } else if (i38 == i14) {
                    i25 = i31;
                    i29 = i36;
                    i21 = i32;
                    i16 = i35;
                    i15 = i37;
                    i20 = i34;
                    i30 = i33;
                    eVar = this;
                    break;
                } else if (i33 == -1) {
                    bArr2[i27] = bArr3[i38];
                    i27++;
                    i18++;
                    i36 = i38;
                    i33 = i36;
                    i15 = i37;
                    i31 = i31;
                } else {
                    if (i38 >= i32) {
                        bArr4[i28] = (byte) i36;
                        i28++;
                        s10 = i33;
                    } else {
                        s10 = i38;
                    }
                    while (s10 >= i13) {
                        bArr4[i28] = bArr3[s10];
                        i28++;
                        s10 = sArr[s10];
                    }
                    i36 = bArr3[s10] & TagConstant.TAG_CAT_RESERVED;
                    byte b10 = (byte) i36;
                    bArr2[i27] = b10;
                    while (true) {
                        i27++;
                        i18++;
                        if (i28 <= 0) {
                            break;
                        }
                        i28--;
                        bArr2[i27] = bArr4[i28];
                    }
                    byte[] bArr6 = bArr4;
                    if (i32 < 4096) {
                        sArr[i32] = (short) i33;
                        bArr3[i32] = b10;
                        i32++;
                        if ((i32 & i22) == 0 && i32 < 4096) {
                            i34++;
                            i22 += i32;
                        }
                    }
                    i33 = i38;
                    i15 = i37;
                    i31 = i31;
                    bArr4 = bArr6;
                }
            }
        }
        Arrays.fill(bArr2, i27, i12, (byte) 0);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f36399l;
            if (i10 < cVar.f36372c) {
                return cVar.f36374e.get(i10).f36367i;
            }
        }
        return -1;
    }

    public final Bitmap n() {
        Boolean bool = this.f36406s;
        Bitmap c10 = this.f36390c.c(this.f36405r, this.f36404q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f36407t);
        c10.setHasAlpha(true);
        return c10;
    }

    public final int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f36391d;
        byteBuffer.get(this.f36392e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    public final int p() {
        return this.f36391d.get() & TagConstant.TAG_CAT_RESERVED;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            this.f36402o = 0;
            this.f36399l = cVar;
            this.f36398k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f36391d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f36391d.order(ByteOrder.LITTLE_ENDIAN);
            this.f36401n = false;
            Iterator<b> it = cVar.f36374e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f36365g == 3) {
                    this.f36401n = true;
                    break;
                }
            }
            this.f36403p = highestOneBit;
            int i11 = cVar.f36375f;
            this.f36405r = i11 / highestOneBit;
            int i12 = cVar.f36376g;
            this.f36404q = i12 / highestOneBit;
            this.f36396i = this.f36390c.b(i11 * i12);
            this.f36397j = this.f36390c.d(this.f36405r * this.f36404q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    public final Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f36397j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f36400m;
            if (bitmap2 != null) {
                this.f36390c.a(bitmap2);
            }
            this.f36400m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f36365g == 3 && this.f36400m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f36365g) > 0) {
            if (i11 == 2) {
                if (!bVar.f36364f) {
                    c cVar = this.f36399l;
                    int i13 = cVar.f36381l;
                    if (bVar.f36369k == null || cVar.f36379j != bVar.f36366h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f36362d;
                int i15 = this.f36403p;
                int i16 = i14 / i15;
                int i17 = bVar2.f36360b / i15;
                int i18 = bVar2.f36361c / i15;
                int i19 = bVar2.f36359a / i15;
                int i20 = this.f36405r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f36405r;
                }
            } else if (i11 == 3 && (bitmap = this.f36400m) != null) {
                int i25 = this.f36405r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f36404q);
            }
        }
        l(bVar);
        if (!bVar.f36363e && this.f36403p == 1) {
            k(bVar);
        } else {
            j(bVar);
        }
        if (this.f36401n && ((i10 = bVar.f36365g) == 0 || i10 == 1)) {
            if (this.f36400m == null) {
                this.f36400m = n();
            }
            Bitmap bitmap3 = this.f36400m;
            int i26 = this.f36405r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f36404q);
        }
        Bitmap n10 = n();
        int i27 = this.f36405r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f36404q);
        return n10;
    }

    public e(a.InterfaceC0463a interfaceC0463a) {
        this.f36389b = new int[256];
        this.f36407t = Bitmap.Config.ARGB_8888;
        this.f36390c = interfaceC0463a;
        this.f36399l = new c();
    }
}
