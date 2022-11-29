package bc;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b2 extends androidx.fragment.app.u {

    /* renamed from: j  reason: collision with root package name */
    public static final a f17272j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f17273k = 8;

    /* renamed from: h  reason: collision with root package name */
    public final Context f17274h;

    /* renamed from: i  reason: collision with root package name */
    public final io.l<Boolean, wn.v> f17275i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b2(FragmentManager fragmentManager, Context context, io.l<? super Boolean, wn.v> lVar) {
        super(fragmentManager);
        jo.p.h(fragmentManager, "fm");
        jo.p.h(context, "context");
        jo.p.h(lVar, "onProgressChangedListener");
        this.f17274h = context;
        this.f17275i = lVar;
    }

    @Override // j5.a
    public int c() {
        ArrayList arrayList;
        arrayList = c2.f17287a;
        return arrayList.size();
    }

    @Override // j5.a
    public CharSequence e(int i10) {
        ArrayList arrayList;
        Context context = this.f17274h;
        arrayList = c2.f17287a;
        Object obj = arrayList.get(i10);
        jo.p.g(obj, "EMOKARASONG_TAB_TITLES[position]");
        String string = context.getString(((Number) obj).intValue());
        jo.p.g(string, "context.getString(EMOKAR…ONG_TAB_TITLES[position])");
        return string;
    }

    @Override // androidx.fragment.app.u, j5.a
    public void m(ViewGroup viewGroup, int i10, Object obj) {
        jo.p.h(viewGroup, TtmlNode.RUBY_CONTAINER);
        jo.p.h(obj, "object");
        super.m(viewGroup, i10, obj);
    }

    @Override // androidx.fragment.app.u
    public Fragment q(int i10) {
        if (i10 == 0) {
            o0 o0Var = new o0();
            o0Var.P3(this.f17275i);
            return o0Var;
        } else if (i10 != 1) {
            return new o0();
        } else {
            i iVar = new i();
            iVar.G3(this.f17275i);
            return iVar;
        }
    }
}
