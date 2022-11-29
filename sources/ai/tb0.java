package ai;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tb0 extends zb0 {

    /* renamed from: u  reason: collision with root package name */
    public static final Set<String> f10208u = vh.g.g("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c  reason: collision with root package name */
    public String f10209c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10210d;

    /* renamed from: e  reason: collision with root package name */
    public int f10211e;

    /* renamed from: f  reason: collision with root package name */
    public int f10212f;

    /* renamed from: g  reason: collision with root package name */
    public int f10213g;

    /* renamed from: h  reason: collision with root package name */
    public int f10214h;

    /* renamed from: i  reason: collision with root package name */
    public int f10215i;

    /* renamed from: j  reason: collision with root package name */
    public int f10216j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f10217k;

    /* renamed from: l  reason: collision with root package name */
    public final rp0 f10218l;

    /* renamed from: m  reason: collision with root package name */
    public final Activity f10219m;

    /* renamed from: n  reason: collision with root package name */
    public ir0 f10220n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f10221o;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f10222p;

    /* renamed from: q  reason: collision with root package name */
    public final ac0 f10223q;

    /* renamed from: r  reason: collision with root package name */
    public PopupWindow f10224r;

    /* renamed from: s  reason: collision with root package name */
    public RelativeLayout f10225s;

    /* renamed from: t  reason: collision with root package name */
    public ViewGroup f10226t;

    public tb0(rp0 rp0Var, ac0 ac0Var) {
        super(rp0Var, "resize");
        this.f10209c = "top-right";
        this.f10210d = true;
        this.f10211e = 0;
        this.f10212f = 0;
        this.f10213g = -1;
        this.f10214h = 0;
        this.f10215i = 0;
        this.f10216j = -1;
        this.f10217k = new Object();
        this.f10218l = rp0Var;
        this.f10219m = rp0Var.g();
        this.f10223q = ac0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257 A[Catch: all -> 0x0482, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:127:0x025c, B:129:0x025e, B:131:0x027e, B:133:0x0282, B:135:0x028f, B:137:0x02cb, B:169:0x0384, B:176:0x03b3, B:177:0x03cb, B:178:0x03ec, B:180:0x03f4, B:181:0x03fb, B:182:0x0422, B:185:0x0425, B:187:0x0435, B:189:0x043f, B:191:0x044f, B:192:0x0464, B:188:0x043a, B:170:0x038b, B:171:0x0392, B:172:0x0399, B:173:0x03a0, B:174:0x03a6, B:175:0x03ad, B:136:0x02c8, B:194:0x0466, B:195:0x046b, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:197:0x046d, B:198:0x0472, B:200:0x0474, B:201:0x0479, B:203:0x047b, B:204:0x0480), top: B:209:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e A[Catch: all -> 0x0482, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:127:0x025c, B:129:0x025e, B:131:0x027e, B:133:0x0282, B:135:0x028f, B:137:0x02cb, B:169:0x0384, B:176:0x03b3, B:177:0x03cb, B:178:0x03ec, B:180:0x03f4, B:181:0x03fb, B:182:0x0422, B:185:0x0425, B:187:0x0435, B:189:0x043f, B:191:0x044f, B:192:0x0464, B:188:0x043a, B:170:0x038b, B:171:0x0392, B:172:0x0399, B:173:0x03a0, B:174:0x03a6, B:175:0x03ad, B:136:0x02c8, B:194:0x0466, B:195:0x046b, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:197:0x046d, B:198:0x0472, B:200:0x0474, B:201:0x0479, B:203:0x047b, B:204:0x0480), top: B:209:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.tb0.h(java.util.Map):void");
    }

    public final void i(boolean z10) {
        synchronized (this.f10217k) {
            PopupWindow popupWindow = this.f10224r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f10225s.removeView((View) this.f10218l);
                ViewGroup viewGroup = this.f10226t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10221o);
                    this.f10226t.addView((View) this.f10218l);
                    this.f10218l.v0(this.f10220n);
                }
                if (z10) {
                    f("default");
                    ac0 ac0Var = this.f10223q;
                    if (ac0Var != null) {
                        ac0Var.zzb();
                    }
                }
                this.f10224r = null;
                this.f10225s = null;
                this.f10226t = null;
                this.f10222p = null;
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        synchronized (this.f10217k) {
            this.f10211e = i10;
            this.f10212f = i11;
        }
    }

    public final boolean k() {
        boolean z10;
        synchronized (this.f10217k) {
            z10 = this.f10224r != null;
        }
        return z10;
    }

    public final void l(int i10, int i11) {
        this.f10211e = i10;
        this.f10212f = i11;
    }
}
