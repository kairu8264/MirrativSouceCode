package l9;

import android.content.Context;
import android.widget.ImageView;
import io.l;
import io.p;
import jo.q;
import l0.i;
import wn.v;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {
        public final /* synthetic */ q1.f A;
        public final /* synthetic */ x0.a B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39706w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f39707x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f39708y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f39709z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, x0.f fVar, Integer num, int i10, q1.f fVar2, x0.a aVar, int i11, int i12) {
            super(2);
            this.f39706w = str;
            this.f39707x = fVar;
            this.f39708y = num;
            this.f39709z = i10;
            this.A = fVar2;
            this.B = aVar;
            this.C = i11;
            this.D = i12;
        }

        public final void a(i iVar, int i10) {
            d.c(this.f39706w, this.f39707x, this.f39708y, this.f39709z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<Context, ImageView> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f39710w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final ImageView invoke(Context context) {
            jo.p.h(context, "it");
            return new ImageView(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<ImageView, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39711w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Boolean f39712x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Boolean bool) {
            super(1);
            this.f39711w = i10;
            this.f39712x = bool;
        }

        public final void a(ImageView imageView) {
            jo.p.h(imageView, "view");
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(this.f39711w);
            Boolean bool = this.f39712x;
            if (bool != null) {
                imageView.setSelected(bool.booleanValue());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(ImageView imageView) {
            a(imageView);
            return v.f59242a;
        }
    }

    /* renamed from: l9.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0568d extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39713w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f39714x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Boolean f39715y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f39716z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0568d(int i10, x0.f fVar, Boolean bool, int i11, int i12) {
            super(2);
            this.f39713w = i10;
            this.f39714x = fVar;
            this.f39715y = bool;
            this.f39716z = i11;
            this.A = i12;
        }

        public final void a(i iVar, int i10) {
            d.a(this.f39713w, this.f39714x, this.f39715y, iVar, this.f39716z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements p<i, Integer, v> {
        public final /* synthetic */ q1.f A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39717w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f39718x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f39719y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f39720z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, x0.f fVar, Integer num, int i11, q1.f fVar2, int i12, int i13) {
            super(2);
            this.f39717w = i10;
            this.f39718x = fVar;
            this.f39719y = num;
            this.f39720z = i11;
            this.A = fVar2;
            this.B = i12;
            this.C = i13;
        }

        public final void a(i iVar, int i10) {
            d.b(this.f39717w, this.f39718x, this.f39719y, this.f39720z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r12, x0.f r13, java.lang.Boolean r14, l0.i r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.d.a(int, x0.f, java.lang.Boolean, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r26, x0.f r27, java.lang.Integer r28, int r29, q1.f r30, l0.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.d.b(int, x0.f, java.lang.Integer, int, q1.f, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r24, x0.f r25, java.lang.Integer r26, int r27, q1.f r28, x0.a r29, l0.i r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.d.c(java.lang.String, x0.f, java.lang.Integer, int, q1.f, x0.a, l0.i, int, int):void");
    }
}
