package bc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class j1 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17365a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17366b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Singer, wn.v> f17367c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17368d;

    /* renamed from: e  reason: collision with root package name */
    public final List<wn.k<z2, Object>> f17369e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17370a;

        static {
            int[] iArr = new int[z2.values().length];
            iArr[z2.TITLE.ordinal()] = 1;
            iArr[z2.EMPTY.ordinal()] = 2;
            iArr[z2.SONG.ordinal()] = 3;
            iArr[z2.SINGER.ordinal()] = 4;
            f17370a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1(Context context, String str, List<Karaoke> list, List<Singer> list2, io.l<? super Karaoke, wn.v> lVar, io.l<? super Singer, wn.v> lVar2, io.l<? super Karaoke, wn.v> lVar3) {
        jo.p.h(context, "context");
        jo.p.h(str, "keyword");
        jo.p.h(list, "songs");
        jo.p.h(list2, "singers");
        jo.p.h(lVar, "onClickSong");
        jo.p.h(lVar2, "onClickSinger");
        jo.p.h(lVar3, "onClickSetting");
        this.f17365a = context;
        this.f17366b = lVar;
        this.f17367c = lVar2;
        this.f17368d = lVar3;
        ArrayList arrayList = new ArrayList();
        this.f17369e = arrayList;
        arrayList.add(new wn.k(z2.TITLE, context.getString(xb.r.text_label_songs)));
        if (list.isEmpty()) {
            arrayList.add(new wn.k(z2.EMPTY, str));
        } else {
            for (Karaoke karaoke : list) {
                this.f17369e.add(new wn.k<>(z2.SONG, karaoke));
            }
        }
        this.f17369e.add(new wn.k<>(z2.TITLE, this.f17365a.getString(xb.r.text_label_singers)));
        if (list2.isEmpty()) {
            this.f17369e.add(new wn.k<>(z2.EMPTY, str));
            return;
        }
        for (Singer singer : list2) {
            this.f17369e.add(new wn.k<>(z2.SINGER, singer));
        }
    }

    public static final void d(j1 j1Var, Object obj, View view) {
        jo.p.h(j1Var, "this$0");
        jo.p.h(obj, "$item");
        j1Var.f17366b.invoke(obj);
    }

    public static final void f(j1 j1Var, Object obj, View view) {
        jo.p.h(j1Var, "this$0");
        jo.p.h(obj, "$item");
        j1Var.f17368d.invoke(obj);
    }

    public static final void g(j1 j1Var, Object obj, View view) {
        jo.p.h(j1Var, "this$0");
        jo.p.h(obj, "$item");
        j1Var.f17367c.invoke(obj);
    }

    public final void clear() {
        this.f17369e.clear();
        List<wn.k<z2, Object>> list = this.f17369e;
        z2 z2Var = z2.TITLE;
        list.add(new wn.k<>(z2Var, this.f17365a.getString(xb.r.text_label_songs)));
        List<wn.k<z2, Object>> list2 = this.f17369e;
        z2 z2Var2 = z2.EMPTY;
        list2.add(new wn.k<>(z2Var2, ""));
        this.f17369e.add(new wn.k<>(z2Var, this.f17365a.getString(xb.r.text_label_singers)));
        this.f17369e.add(new wn.k<>(z2Var2, ""));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17369e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f17369e.get(i10).c().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        final Object d10 = this.f17369e.get(i10).d();
        if (e0Var instanceof y2) {
            if (jo.p.c(d10, this.f17365a.getString(xb.r.text_label_songs))) {
                int i11 = xb.n.ic_recommended_song;
                jo.p.f(d10, "null cannot be cast to non-null type kotlin.String");
                ((y2) e0Var).a(i11, (String) d10);
            } else if (jo.p.c(d10, this.f17365a.getString(xb.r.text_label_singers))) {
                int i12 = xb.n.ic_recommended_artist;
                jo.p.f(d10, "null cannot be cast to non-null type kotlin.String");
                ((y2) e0Var).a(i12, (String) d10);
            }
        } else if (e0Var instanceof p0) {
            jo.p.f(d10, "null cannot be cast to non-null type kotlin.String");
            ((p0) e0Var).a((String) d10);
        } else if (e0Var instanceof c0) {
            c0 c0Var = (c0) e0Var;
            jo.p.f(d10, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.Karaoke");
            c0Var.a((Karaoke) d10);
            c0Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j1.d(j1.this, d10, view);
                }
            });
            c0Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: bc.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j1.f(j1.this, d10, view);
                }
            });
        } else if (e0Var instanceof t1) {
            t1 t1Var = (t1) e0Var;
            jo.p.f(d10, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.Singer");
            t1Var.a((Singer) d10);
            t1Var.d().u().setOnClickListener(new View.OnClickListener() { // from class: bc.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j1.g(j1.this, d10, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        int i11 = a.f17370a[z2.values()[i10].ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return t1.f17486b.a(viewGroup);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return c0.f17278y.a(viewGroup);
            }
            return p0.f17424b.a(viewGroup);
        }
        return y2.f17519b.a(viewGroup);
    }
}
