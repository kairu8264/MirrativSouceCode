package t9;

import ce.t;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestAvatar;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGiftGachaResultsResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestOpenGiftEventResponse;
import com.dena.mirrorman.net.api.response.livegame.LiveGamePingResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.e0;
import io.p;
import java.util.Set;
import jf.k0;
import t9.b;
import uo.l0;
import uo.q0;
import uo.y0;
import wn.m;
import wn.v;
import xn.o;

/* loaded from: classes.dex */
public final class a implements q0 {
    public final xm.e A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f53279w;

    /* renamed from: x  reason: collision with root package name */
    public final EmomoApi f53280x;

    /* renamed from: y  reason: collision with root package name */
    public final MRRequest f53281y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ da.b f53282z;

    /* renamed from: t9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0823a extends ao.a implements l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a f53283w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0823a(l0.a aVar, a aVar2) {
            super(aVar);
            this.f53283w = aVar2;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f53283w.f53279w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$fetchAvatar$2", f = "EmomoQuestGameActionCreator.kt", l = {41, 42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f53284w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f53285x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Set<k0> f53287z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$fetchAvatar$2$avatarRequest$1", f = "EmomoQuestGameActionCreator.kt", l = {40}, m = "invokeSuspend")
        /* renamed from: t9.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0824a extends l implements p<q0, ao.d<? super EmomoQuestAvatar>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f53288w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f53289x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f53290y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0824a(a aVar, String str, ao.d<? super C0824a> dVar) {
                super(2, dVar);
                this.f53289x = aVar;
                this.f53290y = str;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0824a(this.f53289x, this.f53290y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super EmomoQuestAvatar> dVar) {
                return ((C0824a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f53288w;
                if (i10 == 0) {
                    m.b(obj);
                    EmomoApi emomoApi = this.f53289x.f53280x;
                    String str = this.f53290y;
                    this.f53288w = 1;
                    obj = emomoApi.getEmomoQuestAvatar(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$fetchAvatar$2$giftEventIdRequest$1", f = "EmomoQuestGameActionCreator.kt", l = {39}, m = "invokeSuspend")
        /* renamed from: t9.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0825b extends l implements p<q0, ao.d<? super EmomoQuestOpenGiftEventResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f53291w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f53292x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f53293y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0825b(a aVar, String str, ao.d<? super C0825b> dVar) {
                super(2, dVar);
                this.f53292x = aVar;
                this.f53293y = str;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0825b(this.f53292x, this.f53293y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super EmomoQuestOpenGiftEventResponse> dVar) {
                return ((C0825b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f53291w;
                if (i10 == 0) {
                    m.b(obj);
                    EmomoApi emomoApi = this.f53292x.f53280x;
                    String str = this.f53293y;
                    this.f53291w = 1;
                    obj = emomoApi.getEmomoQuestOpenGiftEventId(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<? extends k0> set, String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f53287z = set;
            this.A = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f53287z, this.A, dVar);
            bVar.f53285x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            y0 y0Var;
            EmomoQuestOpenGiftEventResponse emomoQuestOpenGiftEventResponse;
            Object c10 = bo.c.c();
            int i10 = this.f53284w;
            try {
            } catch (Throwable th2) {
                a.this.f53279w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                m.b(obj);
                q0 q0Var = (q0) this.f53285x;
                b10 = uo.l.b(q0Var, null, null, new C0825b(a.this, this.A, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new C0824a(a.this, this.A, null), 3, null);
                this.f53285x = b11;
                this.f53284w = 1;
                Object o10 = b10.o(this);
                if (o10 == c10) {
                    return c10;
                }
                y0Var = b11;
                obj = o10;
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                emomoQuestOpenGiftEventResponse = (EmomoQuestOpenGiftEventResponse) this.f53285x;
                m.b(obj);
                a.this.f53279w.a(new b.C0827b(emomoQuestOpenGiftEventResponse, jf.c.f37906y.a(((EmomoQuestAvatar) obj).getAvatar()), this.f53287z));
                return v.f59242a;
            } else {
                y0Var = (y0) this.f53285x;
                m.b(obj);
            }
            EmomoQuestOpenGiftEventResponse emomoQuestOpenGiftEventResponse2 = (EmomoQuestOpenGiftEventResponse) obj;
            this.f53285x = emomoQuestOpenGiftEventResponse2;
            this.f53284w = 2;
            Object o11 = y0Var.o(this);
            if (o11 == c10) {
                return c10;
            }
            emomoQuestOpenGiftEventResponse = emomoQuestOpenGiftEventResponse2;
            obj = o11;
            a.this.f53279w.a(new b.C0827b(emomoQuestOpenGiftEventResponse, jf.c.f37906y.a(((EmomoQuestAvatar) obj).getAvatar()), this.f53287z));
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postGameEnd$1", f = "EmomoQuestGameActionCreator.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f53294w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53296y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f53297z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f53296y = str;
            this.f53297z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f53296y, this.f53297z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53294w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f53281y;
                    String str = this.f53296y;
                    String str2 = this.f53297z;
                    String str3 = this.A;
                    this.f53294w = 1;
                    if (mRRequest.postLiveGameEnd(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f53279w.a(b.d.f53323a);
            } catch (Throwable th2) {
                a.this.f53279w.a(new b.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ao.a implements l0 {
        public d(l0.a aVar) {
            super(aVar);
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            g9.a.c(th2);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postGameState$2", f = "EmomoQuestGameActionCreator.kt", l = {71, 72}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ int C;
        public final /* synthetic */ boolean D;

        /* renamed from: w  reason: collision with root package name */
        public int f53298w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f53299x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f53301z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postGameState$2$gameStateRequest$1", f = "EmomoQuestGameActionCreator.kt", l = {65}, m = "invokeSuspend")
        /* renamed from: t9.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0826a extends l implements p<q0, ao.d<? super StatusResponse>, Object> {
            public final /* synthetic */ boolean A;

            /* renamed from: w  reason: collision with root package name */
            public int f53302w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f53303x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f53304y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f53305z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0826a(a aVar, String str, int i10, boolean z10, ao.d<? super C0826a> dVar) {
                super(2, dVar);
                this.f53303x = aVar;
                this.f53304y = str;
                this.f53305z = i10;
                this.A = z10;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0826a(this.f53303x, this.f53304y, this.f53305z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super StatusResponse> dVar) {
                return ((C0826a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f53302w;
                if (i10 == 0) {
                    m.b(obj);
                    EmomoApi emomoApi = this.f53303x.f53280x;
                    String str = this.f53304y;
                    int i11 = this.f53305z;
                    boolean z10 = this.A;
                    this.f53302w = 1;
                    obj = emomoApi.postEmomoQuestGameState(str, i11, z10 ? 1 : 0, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postGameState$2$liveGamePingRequest$1", f = "EmomoQuestGameActionCreator.kt", l = {63}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends l implements p<q0, ao.d<? super LiveGamePingResponse>, Object> {
            public final /* synthetic */ String A;

            /* renamed from: w  reason: collision with root package name */
            public int f53306w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f53307x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f53308y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f53309z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, String str, String str2, String str3, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f53307x = aVar;
                this.f53308y = str;
                this.f53309z = str2;
                this.A = str3;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f53307x, this.f53308y, this.f53309z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super LiveGamePingResponse> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f53306w;
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = this.f53307x.f53281y;
                    String str = this.f53308y;
                    String str2 = this.f53309z;
                    String str3 = this.A;
                    this.f53306w = 1;
                    obj = mRRequest.postLiveGamePing(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, int i10, boolean z10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f53301z = str;
            this.A = str2;
            this.B = str3;
            this.C = i10;
            this.D = z10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f53301z, this.A, this.B, this.C, this.D, dVar);
            eVar.f53299x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            y0 y0Var;
            Object c10 = bo.c.c();
            int i10 = this.f53298w;
            try {
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            if (i10 == 0) {
                m.b(obj);
                q0 q0Var = (q0) this.f53299x;
                b10 = uo.l.b(q0Var, null, null, new b(a.this, this.f53301z, this.A, this.B, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new C0826a(a.this, this.f53301z, this.C, this.D, null), 3, null);
                this.f53299x = b11;
                this.f53298w = 1;
                if (b10.o(this) == c10) {
                    return c10;
                }
                y0Var = b11;
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m.b(obj);
                return v.f59242a;
            } else {
                y0Var = (y0) this.f53299x;
                m.b(obj);
            }
            this.f53299x = null;
            this.f53298w = 2;
            if (y0Var.o(this) == c10) {
                return c10;
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postOpenEquipmentGacha$1", f = "EmomoQuestGameActionCreator.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f53310w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53312y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f53313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, int i10, int i11, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f53312y = str;
            this.f53313z = i10;
            this.A = i11;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f53312y, this.f53313z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53310w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    EmomoApi emomoApi = a.this.f53280x;
                    String str = this.f53312y;
                    int i11 = this.f53313z;
                    int i12 = this.A;
                    this.f53310w = 1;
                    obj = emomoApi.postEmomoQuestOpenEquipmentGacha(str, i11, i12, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                String o10 = ((e0) obj).o();
                EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse = (EmomoQuestEquipmentGachaResultsResponse) a.this.A.i(o10, EmomoQuestEquipmentGachaResultsResponse.class);
                q8.a aVar = a.this.f53279w;
                jo.p.g(emomoQuestEquipmentGachaResultsResponse, "responseData");
                aVar.a(new b.f(emomoQuestEquipmentGachaResultsResponse, o10));
            } catch (Throwable th2) {
                a.this.f53279w.a(new b.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActionCreator$postOpenGiftGacha$1", f = "EmomoQuestGameActionCreator.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53314w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53316y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f53317z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f53316y = str;
            this.f53317z = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f53316y, this.f53317z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53314w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    EmomoApi emomoApi = a.this.f53280x;
                    String str = this.f53316y;
                    int i11 = this.f53317z;
                    this.f53314w = 1;
                    obj = emomoApi.postEmomoQuestOpenGiftGacha(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                String o10 = ((e0) obj).o();
                EmomoQuestGiftGachaResultsResponse emomoQuestGiftGachaResultsResponse = (EmomoQuestGiftGachaResultsResponse) a.this.A.i(o10, EmomoQuestGiftGachaResultsResponse.class);
                q8.a aVar = a.this.f53279w;
                jo.p.g(emomoQuestGiftGachaResultsResponse, "responseData");
                aVar.a(new b.h(emomoQuestGiftGachaResultsResponse, o10));
            } catch (Throwable th2) {
                a.this.f53279w.a(new b.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, EmomoApi emomoApi, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(emomoApi, "api");
        jo.p.h(mRRequest, "request");
        this.f53279w = aVar;
        this.f53280x = emomoApi;
        this.f53281y = mRRequest;
        this.f53282z = new da.b();
        xm.e b10 = new xm.f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b();
        jo.p.g(b10, "GsonBuilder()\n        .s…SCORES)\n        .create()");
        this.A = b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(a aVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = o.i0(k0.values());
        }
        aVar.e(str, set);
    }

    public final void e(String str, Set<? extends k0> set) {
        jo.p.h(str, "referer");
        jo.p.h(set, "updateParts");
        uo.l.d(this, new C0823a(l0.f56050r, this), null, new b(set, str, null), 2, null);
    }

    public final void g() {
        this.f53279w.a(t.j.f19481a);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f53282z.getCoroutineContext();
    }

    public final void h(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "playId");
        uo.l.d(this, null, null, new c(str, str2, str3, null), 3, null);
    }

    public final void i(String str, int i10, boolean z10, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "playId");
        uo.l.d(this, new d(l0.f56050r), null, new e(str, str2, str3, i10, z10, null), 2, null);
    }

    public final void j(String str, int i10, int i11) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new f(str, i10, i11, null), 3, null);
    }

    public final void k(String str, int i10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new g(str, i10, null), 3, null);
    }

    public final void l() {
        this.f53279w.a(t.k.f19482a);
    }
}
