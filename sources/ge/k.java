package ge;

import android.content.Context;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Chat;
import com.dena.mirrorman.net.glide.GlideApp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ge.k;
import hf.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jo.f0;
import jo.i0;
import jo.p;
import jo.q;
import nd.b1;
import nd.c0;
import nd.f1;
import nd.y0;
import nd.z0;
import oq.a;
import so.o;
import wn.v;
import xn.a0;
import xn.s;
import xn.t;
import xn.t0;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.h<h> implements oq.a {
    public final List<d> A;
    public boolean B;
    public final Map<String, Long> C;
    public final Map<String, Long> D;
    public Long E;
    public final wn.f F;

    /* renamed from: w  reason: collision with root package name */
    public final Context f33271w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f33272x;

    /* renamed from: y  reason: collision with root package name */
    public final f f33273y;

    /* renamed from: z  reason: collision with root package name */
    public final io.l<Chat.Message, v> f33274z;

    /* loaded from: classes2.dex */
    public static final class a extends h {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f33275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            p.h(view, "itemView");
            View findViewById = view.findViewById(z0.f42292h0);
            p.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f33275b = (TextView) findViewById;
        }

        @Override // ge.k.h
        public void a(d dVar, k kVar) {
            p.h(dVar, "item");
            p.h(kVar, "adapter");
            this.f33275b.setText(DateFormat.format(kVar.f33271w.getString(f1.text_chat_dateformat_android), new Date(dVar.h() * 1000)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f33276b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f33277c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f33278d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f33279e;

        /* renamed from: f  reason: collision with root package name */
        public final TextView f33280f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            p.h(view, "itemView");
            this.f33276b = (TextView) view.findViewById(z0.f42287fg);
            this.f33277c = (ImageView) view.findViewById(z0.avatar);
            View findViewById = view.findViewById(z0.f42292h0);
            p.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f33278d = (TextView) findViewById;
            this.f33279e = (TextView) view.findViewById(z0.read_num);
            View findViewById2 = view.findViewById(z0.Ee);
            p.f(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f33280f = (TextView) findViewById2;
        }

        public static final void f(b bVar, io.l lVar, Chat.Message message, View view) {
            p.h(bVar, "this$0");
            p.h(lVar, "$onMessageClickListener");
            p.h(message, "$message");
            if (bVar.f33276b != null) {
                lVar.invoke(message);
            }
        }

        public static final void g(b bVar, View view, boolean z10) {
            p.h(bVar, "this$0");
            if (z10) {
                bVar.f33278d.callOnClick();
            }
        }

        public final void d(d dVar, k kVar, final io.l<? super Chat.Message, v> lVar) {
            int i10;
            boolean z10;
            p.h(dVar, "item");
            p.h(kVar, "adapter");
            p.h(lVar, "onMessageClickListener");
            final Chat.Message i11 = dVar.i();
            if (i11 == null) {
                return;
            }
            String string = kVar.f33271w.getString(f1.text_chat_read);
            p.g(string, "adapter.context.getString(R.string.text_chat_read)");
            Set<Map.Entry> entrySet = kVar.D.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (Map.Entry entry : entrySet) {
                    if (!p.c(entry.getKey(), i11.getUserId())) {
                        Long l10 = (Long) kVar.C.get(entry.getKey());
                        long longValue = l10 != null ? l10.longValue() : 0L;
                        long longValue2 = ((Number) entry.getValue()).longValue();
                        long id2 = i11.getId();
                        if (longValue <= id2 && id2 <= longValue2) {
                            z10 = true;
                            if (z10 && (i10 = i10 + 1) < 0) {
                                s.s();
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        s.s();
                    }
                }
            }
            TextView textView = this.f33279e;
            if (textView != null) {
                textView.setVisibility(i10 == 0 ? 8 : 0);
            }
            TextView textView2 = this.f33279e;
            if (textView2 != null) {
                if (kVar.f33272x) {
                    i0 i0Var = i0.f38149a;
                    string = String.format("%s%d", Arrays.copyOf(new Object[]{kVar.f33271w.getString(f1.text_chat_read), Integer.valueOf(i10)}, 2));
                    p.g(string, "format(format, *args)");
                }
                textView2.setText(string);
            }
            TextView textView3 = this.f33280f;
            h.a aVar = h.f33292a;
            textView3.setText(aVar.b(dVar.e()));
            aVar.c(kVar, this.f33276b, this.f33277c, i11.getText().getUserName(), i11.getText().getAvatarImageUrl(), dVar.m());
            this.f33278d.setText(i11.getText().getBody());
            TextPaint paint = this.f33278d.getPaint();
            List<String> d10 = new so.e("\\r?\\n").d(i11.getText().getBody(), 0);
            ArrayList arrayList = new ArrayList(t.u(d10, 10));
            for (String str : d10) {
                arrayList.add(Integer.valueOf((int) paint.measureText(str)));
            }
            Integer num = (Integer) a0.k0(arrayList);
            int intValue = num != null ? num.intValue() : 0;
            TextView textView4 = this.f33278d;
            textView4.setWidth(intValue + textView4.getPaddingLeft() + this.f33278d.getPaddingRight());
            this.f33278d.setOnClickListener(new View.OnClickListener() { // from class: ge.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.b.f(k.b.this, lVar, i11, view);
                }
            });
            this.f33278d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ge.m
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    k.b.g(k.b.this, view, z11);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f33281b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f33282c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f33283d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f33284e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f33285f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            p.h(view, "itemView");
            this.f33281b = (TextView) view.findViewById(z0.f42287fg);
            this.f33282c = (ImageView) view.findViewById(z0.avatar);
            this.f33283d = (TextView) view.findViewById(z0.read_num);
            View findViewById = view.findViewById(z0.Ee);
            p.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f33284e = (TextView) findViewById;
            View findViewById2 = view.findViewById(z0.fixedimage_body);
            p.f(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f33285f = (ImageView) findViewById2;
        }

        @Override // ge.k.h
        public void a(d dVar, k kVar) {
            int i10;
            boolean z10;
            p.h(dVar, "item");
            p.h(kVar, "adapter");
            Chat.Message i11 = dVar.i();
            if ((i11 != null ? i11.getFixedImage() : null) == null) {
                return;
            }
            Chat.Message.FixedImage fixedImage = dVar.i().getFixedImage();
            String string = kVar.f33271w.getString(f1.text_chat_read);
            p.g(string, "adapter.context.getString(R.string.text_chat_read)");
            Set<Map.Entry> entrySet = kVar.D.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (Map.Entry entry : entrySet) {
                    if (!p.c(entry.getKey(), dVar.i().getUserId())) {
                        Long l10 = (Long) kVar.C.get(entry.getKey());
                        long longValue = l10 != null ? l10.longValue() : 0L;
                        long longValue2 = ((Number) entry.getValue()).longValue();
                        long id2 = dVar.i().getId();
                        if (longValue <= id2 && id2 <= longValue2) {
                            z10 = true;
                            if (z10 && (i10 = i10 + 1) < 0) {
                                s.s();
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        s.s();
                    }
                }
            }
            TextView textView = this.f33283d;
            if (textView != null) {
                textView.setVisibility(i10 == 0 ? 8 : 0);
            }
            TextView textView2 = this.f33283d;
            if (textView2 != null) {
                if (kVar.f33272x) {
                    i0 i0Var = i0.f38149a;
                    string = String.format("%s%d", Arrays.copyOf(new Object[]{kVar.f33271w.getString(f1.text_chat_read), Integer.valueOf(i10)}, 2));
                    p.g(string, "format(format, *args)");
                }
                textView2.setText(string);
            }
            TextView textView3 = this.f33284e;
            h.a aVar = h.f33292a;
            textView3.setText(aVar.b(dVar.e()));
            aVar.c(kVar, this.f33281b, this.f33282c, fixedImage.getUserName(), fixedImage.getAvatarImageUrl(), dVar.m());
            DisplayMetrics displayMetrics = kVar.f33271w.getResources().getDisplayMetrics();
            if (fixedImage.getContentImages() != null) {
                if (fixedImage.getContentImages().getContentImageJa() != null) {
                    this.f33285f.getLayoutParams().height = (int) (fixedImage.getContentImages().getContentImageJa().getHeight() * displayMetrics.density);
                    this.f33285f.getLayoutParams().width = (int) (fixedImage.getContentImages().getContentImageJa().getWidth() * displayMetrics.density);
                    td.a.f(this.f33285f, fixedImage.getContentImages().getContentImageJa().getUrl());
                    return;
                }
                this.f33285f.getLayoutParams().height = (int) (fixedImage.getContentImages().getContentImageDefault().getHeight() * displayMetrics.density);
                this.f33285f.getLayoutParams().width = (int) (fixedImage.getContentImages().getContentImageDefault().getWidth() * displayMetrics.density);
                td.a.f(this.f33285f, fixedImage.getContentImages().getContentImageDefault().getUrl());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            p.h(view, "itemView");
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(long j10);
    }

    /* loaded from: classes2.dex */
    public static final class g extends h {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f33291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view);
            p.h(view, "itemView");
            View findViewById = view.findViewById(z0.f42292h0);
            p.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f33291b = (TextView) findViewById;
        }

        @Override // ge.k.h
        public void a(d dVar, k kVar) {
            String string;
            p.h(dVar, "item");
            p.h(kVar, "adapter");
            if (dVar.i() == null) {
                return;
            }
            if (so.n.q(dVar.l(), "invited", true)) {
                Chat.Message.Invited invited = dVar.i().getInvited();
                string = kVar.f33271w.getString(f1.text_chat_minutes_invite, invited.getUserName(), vp.b.b(invited.getInvitedUserNames(), ", "));
                p.g(string, "adapter.context.getStrin… \")\n                    )");
            } else if (so.n.q(dVar.l(), "joined", true)) {
                string = kVar.f33271w.getString(f1.text_chat_minutes_enter, dVar.i().getJoined().getUserName());
                p.g(string, "adapter.context.getStrin…ame\n                    )");
            } else if (so.n.q(dVar.l(), TtmlNode.LEFT, true)) {
                string = kVar.f33271w.getString(f1.text_chat_minutes_leave, dVar.i().getLeft().getUserName());
                p.g(string, "adapter.context.getStrin…ame\n                    )");
            } else if (!so.n.q(dVar.l(), "kicked", true)) {
                return;
            } else {
                Chat.Message.Kicked kicked = dVar.i().getKicked();
                string = kVar.f33271w.getString(f1.text_chat_minutes_exile, vp.b.b(kicked.getKickedUserNames(), ", "), kicked.getUserName());
                p.g(string, "adapter.context.getStrin…ame\n                    )");
            }
            TextView textView = this.f33291b;
            textView.setText(h.f33292a.b(dVar.e()) + '\n' + string);
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33292a = new a(null);

        /* loaded from: classes2.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public static final void d(String str, View view) {
                p.h(str, "$userId");
                dq.c.c().l(new c0(str));
            }

            public final String b(long j10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(j10 * 1000));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(calendar.get(11));
                sb2.append(':');
                i0 i0Var = i0.f38149a;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1));
                p.g(format, "format(format, *args)");
                sb2.append(format);
                return sb2.toString();
            }

            public final void c(k kVar, TextView textView, ImageView imageView, String str, String str2, final String str3) {
                p.h(kVar, "adapter");
                p.h(str, "username");
                p.h(str2, "avatarImageUrl");
                p.h(str3, "userId");
                if (textView != null) {
                    textView.setText(str);
                }
                if (imageView != null) {
                    GlideApp.with(kVar.f33271w).load(str2).placeholder(y0.W1).apply((e8.a<?>) new e8.h().circleCrop()).into(imageView);
                    if (kVar.m().i(str3)) {
                        return;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: ge.n
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            k.h.a.d(str3, view);
                        }
                    });
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view) {
            super(view);
            p.h(view, "itemView");
        }

        public void a(d dVar, k kVar) {
            p.h(dVar, "item");
            p.h(kVar, "adapter");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33293w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33294x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33295y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33293w = aVar;
            this.f33294x = aVar2;
            this.f33295y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f33293w;
            vq.a aVar2 = this.f33294x;
            io.a<? extends uq.a> aVar3 = this.f33295y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(v0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, boolean z10, f fVar, io.l<? super Chat.Message, v> lVar) {
        p.h(context, "context");
        p.h(fVar, "newestIdUpdateListener");
        p.h(lVar, "onMessageClickListener");
        this.f33271w = context;
        this.f33272x = z10;
        this.f33273y = fVar;
        this.f33274z = lVar;
        this.A = s.p(new d(d.b.LatestAnchor, Long.MAX_VALUE));
        this.C = new LinkedHashMap();
        this.D = new LinkedHashMap();
        this.F = wn.g.b(cr.a.f28611a.b(), new i(this, null, null));
        r(true);
    }

    public final boolean g(int i10, d dVar) {
        int size = this.A.size();
        if (i10 < 0) {
            return false;
        }
        if (i10 >= size) {
            this.A.add(dVar);
            notifyItemInserted(size);
            this.A.add(new d(d.b.Day, dVar.h()));
            notifyItemInserted(size);
            return true;
        }
        if (dVar.h() > this.A.get(i10).h()) {
            this.A.add(i10, new d(d.b.Day, dVar.h()));
            notifyItemInserted(i10);
        }
        this.A.add(i10, dVar);
        notifyItemInserted(i10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int size;
        synchronized (this.A) {
            size = this.A.size();
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        d.b n10;
        d l10 = l(i10);
        if (l10 == null || (n10 = l10.n()) == null) {
            return 0;
        }
        return n10.c();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 > r8.longValue()) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(com.dena.mirrorman.net.api.response.Chat.Message r8) {
        /*
            r7 = this;
            java.lang.String r0 = "message"
            jo.p.h(r8, r0)
            ge.k$d r8 = r7.j(r8)
            r0 = -1
            if (r8 != 0) goto Ld
            return r0
        Ld:
            com.dena.mirrorman.net.api.response.Chat$Message r1 = r8.i()
            if (r1 != 0) goto L16
            r1 = 0
            goto L1e
        L16:
            com.dena.mirrorman.net.api.response.Chat$Message r1 = r8.i()
            long r1 = r1.getId()
        L1e:
            java.util.List<ge.k$d> r3 = r7.A
            monitor-enter(r3)
            int r4 = r7.p(r8)     // Catch: java.lang.Throwable -> L53
            boolean r8 = r7.g(r4, r8)     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L2d
            monitor-exit(r3)
            return r0
        L2d:
            java.lang.Long r8 = r7.E     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L3c
            jo.p.e(r8)     // Catch: java.lang.Throwable -> L53
            long r5 = r8.longValue()     // Catch: java.lang.Throwable -> L53
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto L4e
        L3c:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L53
            r7.E = r8     // Catch: java.lang.Throwable -> L53
            ge.k$f r0 = r7.f33273y     // Catch: java.lang.Throwable -> L53
            jo.p.e(r8)     // Catch: java.lang.Throwable -> L53
            long r1 = r8.longValue()     // Catch: java.lang.Throwable -> L53
            r0.a(r1)     // Catch: java.lang.Throwable -> L53
        L4e:
            r7.t()     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)
            return r4
        L53:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.k.h(com.dena.mirrorman.net.api.response.Chat$Message):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0 > r6.longValue()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.dena.mirrorman.net.api.response.Chat.Message r6) {
        /*
            r5 = this;
            java.lang.String r0 = "message"
            jo.p.h(r6, r0)
            ge.k$d r6 = r5.j(r6)
            if (r6 != 0) goto Lc
            return
        Lc:
            com.dena.mirrorman.net.api.response.Chat$Message r0 = r6.i()
            if (r0 != 0) goto L15
            r0 = 0
            goto L1d
        L15:
            com.dena.mirrorman.net.api.response.Chat$Message r0 = r6.i()
            long r0 = r0.getId()
        L1d:
            java.util.List<ge.k$d> r2 = r5.A
            monitor-enter(r2)
            int r3 = r5.q(r6)     // Catch: java.lang.Throwable -> L52
            boolean r6 = r5.g(r3, r6)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L4b
            java.lang.Long r6 = r5.E     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L39
            jo.p.e(r6)     // Catch: java.lang.Throwable -> L52
            long r3 = r6.longValue()     // Catch: java.lang.Throwable -> L52
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L4b
        L39:
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L52
            r5.E = r6     // Catch: java.lang.Throwable -> L52
            ge.k$f r0 = r5.f33273y     // Catch: java.lang.Throwable -> L52
            jo.p.e(r6)     // Catch: java.lang.Throwable -> L52
            long r3 = r6.longValue()     // Catch: java.lang.Throwable -> L52
            r0.a(r3)     // Catch: java.lang.Throwable -> L52
        L4b:
            r5.t()     // Catch: java.lang.Throwable -> L52
            wn.v r6 = wn.v.f59242a     // Catch: java.lang.Throwable -> L52
            monitor-exit(r2)
            return
        L52:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.k.i(com.dena.mirrorman.net.api.response.Chat$Message):void");
    }

    public final d j(Chat.Message message) {
        n3.d<String, d.b> a10;
        String str;
        d.b bVar;
        if ((message.getType().length() == 0) || (a10 = d.C.a(message, m().i(message.getUserId()))) == null || (str = a10.f41559a) == null || (bVar = a10.f41560b) == null) {
            return null;
        }
        p.g(bVar, "second");
        return new d(str, bVar, message);
    }

    public final boolean k() {
        return this.B;
    }

    public final d l(int i10) {
        synchronized (this.A) {
            if (i10 >= 0) {
                if (i10 < this.A.size()) {
                    return this.A.get(i10);
                }
            }
            v vVar = v.f59242a;
            return null;
        }
    }

    public final v0 m() {
        return (v0) this.F.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: n */
    public void onBindViewHolder(h hVar, int i10) {
        p.h(hVar, "holder");
        d l10 = l(i10);
        if (l10 == null) {
            return;
        }
        if (hVar instanceof b) {
            ((b) hVar).d(l10, this, this.f33274z);
        } else {
            hVar.a(l10, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: o */
    public h onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i10 == d.b.Loading.c()) {
            View inflate = from.inflate(b1.item_chat_timeline_loading, viewGroup, false);
            p.g(inflate, "inflater.inflate(\n      …  false\n                )");
            return new e(inflate);
        } else if (i10 == d.b.LatestAnchor.c()) {
            View inflate2 = from.inflate(b1.item_chat_timeline_blank, viewGroup, false);
            p.g(inflate2, "inflater.inflate(\n      …  false\n                )");
            return new h(inflate2);
        } else if (i10 == d.b.Day.c()) {
            View inflate3 = from.inflate(b1.item_chat_timeline_state_changed, viewGroup, false);
            p.g(inflate3, "inflater.inflate(\n      …  false\n                )");
            return new a(inflate3);
        } else if (i10 == d.b.Default.c()) {
            View inflate4 = from.inflate(b1.item_chat_timeline_default, viewGroup, false);
            p.g(inflate4, "inflater.inflate(\n      …  false\n                )");
            return new b(inflate4);
        } else if (i10 == d.b.OwnDefault.c()) {
            View inflate5 = from.inflate(b1.item_chat_timeline_own_default, viewGroup, false);
            p.g(inflate5, "inflater.inflate(\n      …  false\n                )");
            return new b(inflate5);
        } else if (i10 == d.b.FixedImage.c()) {
            View inflate6 = from.inflate(b1.item_chat_timeline_fixedimage, viewGroup, false);
            p.g(inflate6, "inflater.inflate(\n      …  false\n                )");
            return new c(inflate6);
        } else if (i10 == d.b.OwnFixedImage.c()) {
            View inflate7 = from.inflate(b1.item_chat_timeline_own_fixedimage, viewGroup, false);
            p.g(inflate7, "inflater.inflate(\n      …  false\n                )");
            return new c(inflate7);
        } else {
            View inflate8 = from.inflate(b1.item_chat_timeline_state_changed, viewGroup, false);
            p.g(inflate8, "inflater.inflate(\n      …  false\n                )");
            return new g(inflate8);
        }
    }

    public final int p(d dVar) {
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            int compareTo = dVar.compareTo(this.A.get(i10));
            if (compareTo < 0) {
                return i10;
            }
            if (compareTo == 0) {
                return -1;
            }
        }
        return size;
    }

    public final int q(d dVar) {
        int size = this.A.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return 0;
            }
            int compareTo = dVar.compareTo(this.A.get(size));
            if (compareTo > 0) {
                return size + 1;
            }
            if (compareTo == 0) {
                return -1;
            }
        }
    }

    public final void r(boolean z10) {
        synchronized (this.A) {
            int size = this.A.size();
            if (this.B != z10) {
                this.B = z10;
                if (z10) {
                    this.A.add(new d(d.b.Loading, 0L));
                    notifyItemInserted(size);
                } else {
                    int i10 = size - 1;
                    this.A.remove(i10);
                    notifyItemRemoved(i10);
                }
            }
            v vVar = v.f59242a;
        }
    }

    public final void s(List<Chat.Join.LastReadMessage> list) {
        p.h(list, "lastReadMessages");
        this.C.clear();
        this.D.clear();
        for (Chat.Join.LastReadMessage lastReadMessage : list) {
            this.C.put(lastReadMessage.getUserId(), Long.valueOf(lastReadMessage.getInvitedMessageId()));
            this.D.put(lastReadMessage.getUserId(), Long.valueOf(lastReadMessage.getLastReadMessageId()));
        }
    }

    public final void t() {
        synchronized (this.A) {
            if (this.A.isEmpty() || this.A.get(0).n() != d.b.LatestAnchor) {
                this.A.add(0, new d(d.b.LatestAnchor, Long.MAX_VALUE));
                notifyItemInserted(0);
            }
            v vVar = v.f59242a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r6.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.String r16, long r17, long r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            java.lang.String r2 = "userId"
            jo.p.h(r0, r2)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.D
            java.lang.Object r2 = r2.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L17
            long r2 = r2.longValue()
            goto L19
        L17:
            r2 = 0
        L19:
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 < 0) goto L1e
            return
        L1e:
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            java.util.Map<java.lang.String, java.lang.Long> r5 = r1.C
            r5.put(r0, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            java.util.Map<java.lang.String, java.lang.Long> r5 = r1.D
            r5.put(r0, r4)
            java.util.List<ge.k$d> r4 = r1.A
            monitor-enter(r4)
            java.util.List<ge.k$d> r5 = r1.A     // Catch: java.lang.Throwable -> Lc5
            java.lang.Iterable r5 = xn.a0.H0(r5)     // Catch: java.lang.Throwable -> Lc5
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5
            r6.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc5
        L42:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc5
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Lc5
            r10 = r7
            xn.f0 r10 = (xn.f0) r10     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> Lc5
            ge.k$d r10 = (ge.k.d) r10     // Catch: java.lang.Throwable -> Lc5
            ge.k$d$b r11 = r10.n()     // Catch: java.lang.Throwable -> Lc5
            ge.k$d$b r12 = ge.k.d.b.OwnDefault     // Catch: java.lang.Throwable -> Lc5
            if (r11 == r12) goto L69
            ge.k$d$b r10 = r10.n()     // Catch: java.lang.Throwable -> Lc5
            ge.k$d$b r11 = ge.k.d.b.OwnFixedImage     // Catch: java.lang.Throwable -> Lc5
            if (r10 != r11) goto L68
            goto L69
        L68:
            r8 = r9
        L69:
            if (r8 == 0) goto L42
            r6.add(r7)     // Catch: java.lang.Throwable -> Lc5
            goto L42
        L6f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5
            r7 = 10
            int r7 = xn.t.u(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lc5
        L7e:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lc3
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lc5
            xn.f0 r7 = (xn.f0) r7     // Catch: java.lang.Throwable -> Lc5
            int r10 = r7.a()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Lc5
            ge.k$d r7 = (ge.k.d) r7     // Catch: java.lang.Throwable -> Lc5
            com.dena.mirrorman.net.api.response.Chat$Message r7 = r7.i()     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lbe
            java.lang.String r11 = r7.getUserId()     // Catch: java.lang.Throwable -> Lc5
            boolean r11 = jo.p.c(r11, r0)     // Catch: java.lang.Throwable -> Lc5
            if (r11 != 0) goto Lbb
            r11 = 1
            long r11 = r11 + r2
            long r13 = r7.getId()     // Catch: java.lang.Throwable -> Lc5
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 > 0) goto Lb5
            int r7 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r7 > 0) goto Lb5
            r7 = r8
            goto Lb6
        Lb5:
            r7 = r9
        Lb6:
            if (r7 == 0) goto Lbb
            r15.notifyItemChanged(r10)     // Catch: java.lang.Throwable -> Lc5
        Lbb:
            wn.v r7 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lc5
            goto Lbf
        Lbe:
            r7 = 0
        Lbf:
            r5.add(r7)     // Catch: java.lang.Throwable -> Lc5
            goto L7e
        Lc3:
            monitor-exit(r4)
            return
        Lc5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.k.u(java.lang.String, long, long):void");
    }

    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {
        public static final a C = new a(null);
        public static final int D = 8;
        public static final Set<String> E = t0.e("invited", "joined", TtmlNode.LEFT, "kicked");
        public final long A;
        public final Chat.Message B;

        /* renamed from: w  reason: collision with root package name */
        public final String f33286w;

        /* renamed from: x  reason: collision with root package name */
        public final String f33287x;

        /* renamed from: y  reason: collision with root package name */
        public final b f33288y;

        /* renamed from: z  reason: collision with root package name */
        public final long f33289z;

        /* loaded from: classes2.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final n3.d<String, b> a(Chat.Message message, boolean z10) {
                p.h(message, "payload");
                for (String str : o.r0(message.getType(), new String[]{","}, false, 0, 6, null)) {
                    if (p.c(str, "text")) {
                        if (message.getText() == null) {
                            return null;
                        }
                        return n3.d.a(str, z10 ? b.OwnDefault : b.Default);
                    } else if (!p.c(str, "fixed_image")) {
                        if (d.E.contains(str)) {
                            if (p.c(str, "invited") && message.getInvited() == null) {
                                return null;
                            }
                            if (p.c(str, "joined") && message.getJoined() == null) {
                                return null;
                            }
                            if (p.c(str, TtmlNode.LEFT) && message.getLeft() == null) {
                                return null;
                            }
                            if (p.c(str, "kicked") && message.getKicked() == null) {
                                return null;
                            }
                            return n3.d.a(str, b.StateChanged);
                        }
                    } else if (message.getFixedImage() == null) {
                        return null;
                    } else {
                        return n3.d.a(str, z10 ? b.OwnFixedImage : b.FixedImage);
                    }
                }
                return null;
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            Loading(-1000),
            LatestAnchor(1000),
            Day(1),
            Default(2),
            OwnDefault(3),
            StateChanged(4),
            FixedImage(5),
            OwnFixedImage(6);
            

            /* renamed from: id  reason: collision with root package name */
            private final int f33290id;

            b(int i10) {
                this.f33290id = i10;
            }

            public final int c() {
                return this.f33290id;
            }
        }

        public d(String str, b bVar, Chat.Message message) {
            p.h(str, "type");
            p.h(bVar, "viewType");
            p.h(message, "payload");
            this.f33287x = str;
            this.f33286w = message.getUserId();
            this.f33288y = bVar;
            this.f33289z = message.getCreatedAt();
            long j10 = 1000;
            this.A = yp.a.b(new Date(message.getCreatedAt() * j10), 5).getTime() / j10;
            this.B = message;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(d dVar) {
            p.h(dVar, "other");
            long j10 = this.f33289z;
            long j11 = dVar.f33289z;
            if (j10 <= j11) {
                if (j10 != j11) {
                    return 1;
                }
                if (this.B == null) {
                    return dVar.B == null ? 0 : 1;
                }
                Chat.Message message = dVar.B;
                if (message != null) {
                    return (int) (message.getId() - this.B.getId());
                }
            }
            return -1;
        }

        public final long e() {
            return this.f33289z;
        }

        public final long h() {
            return this.A;
        }

        public final Chat.Message i() {
            return this.B;
        }

        public final String l() {
            return this.f33287x;
        }

        public final String m() {
            return this.f33286w;
        }

        public final b n() {
            return this.f33288y;
        }

        public d(b bVar, long j10) {
            p.h(bVar, "viewType");
            this.f33286w = "";
            this.f33287x = "";
            this.f33288y = bVar;
            this.f33289z = j10;
            long j11 = 1000;
            this.A = yp.a.b(new Date(j10 * j11), 5).getTime() / j11;
            this.B = null;
        }
    }
}
