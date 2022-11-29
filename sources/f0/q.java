package f0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final p f31580a = new c(a(b.D));

    /* loaded from: classes.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.l<l1.b, Boolean> f31581a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super l1.b, Boolean> lVar) {
            this.f31581a = lVar;
        }

        @Override // f0.p
        public n a(KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (this.f31581a.invoke(l1.b.a(keyEvent)).booleanValue() && l1.d.e(keyEvent)) {
                if (l1.a.l(l1.d.a(keyEvent), x.f31662a.v())) {
                    return n.REDO;
                }
                return null;
            } else if (this.f31581a.invoke(l1.b.a(keyEvent)).booleanValue()) {
                long a10 = l1.d.a(keyEvent);
                x xVar = x.f31662a;
                if (l1.a.l(a10, xVar.d()) ? true : l1.a.l(a10, xVar.m())) {
                    return n.COPY;
                }
                if (l1.a.l(a10, xVar.t())) {
                    return n.PASTE;
                }
                if (l1.a.l(a10, xVar.u())) {
                    return n.CUT;
                }
                if (l1.a.l(a10, xVar.a())) {
                    return n.SELECT_ALL;
                }
                if (l1.a.l(a10, xVar.v())) {
                    return n.UNDO;
                }
                return null;
            } else if (l1.d.d(keyEvent)) {
                return null;
            } else {
                if (l1.d.e(keyEvent)) {
                    long a11 = l1.d.a(keyEvent);
                    x xVar2 = x.f31662a;
                    if (l1.a.l(a11, xVar2.h())) {
                        return n.SELECT_LEFT_CHAR;
                    }
                    if (l1.a.l(a11, xVar2.i())) {
                        return n.SELECT_RIGHT_CHAR;
                    }
                    if (l1.a.l(a11, xVar2.j())) {
                        return n.SELECT_UP;
                    }
                    if (l1.a.l(a11, xVar2.g())) {
                        return n.SELECT_DOWN;
                    }
                    if (l1.a.l(a11, xVar2.q())) {
                        return n.SELECT_PAGE_UP;
                    }
                    if (l1.a.l(a11, xVar2.p())) {
                        return n.SELECT_PAGE_DOWN;
                    }
                    if (l1.a.l(a11, xVar2.o())) {
                        return n.SELECT_LINE_START;
                    }
                    if (l1.a.l(a11, xVar2.n())) {
                        return n.SELECT_LINE_END;
                    }
                    if (l1.a.l(a11, xVar2.m())) {
                        return n.PASTE;
                    }
                    return null;
                }
                long a12 = l1.d.a(keyEvent);
                x xVar3 = x.f31662a;
                if (l1.a.l(a12, xVar3.h())) {
                    return n.LEFT_CHAR;
                }
                if (l1.a.l(a12, xVar3.i())) {
                    return n.RIGHT_CHAR;
                }
                if (l1.a.l(a12, xVar3.j())) {
                    return n.UP;
                }
                if (l1.a.l(a12, xVar3.g())) {
                    return n.DOWN;
                }
                if (l1.a.l(a12, xVar3.q())) {
                    return n.PAGE_UP;
                }
                if (l1.a.l(a12, xVar3.p())) {
                    return n.PAGE_DOWN;
                }
                if (l1.a.l(a12, xVar3.o())) {
                    return n.LINE_START;
                }
                if (l1.a.l(a12, xVar3.n())) {
                    return n.LINE_END;
                }
                if (l1.a.l(a12, xVar3.k())) {
                    return n.NEW_LINE;
                }
                if (l1.a.l(a12, xVar3.c())) {
                    return n.DELETE_PREV_CHAR;
                }
                if (l1.a.l(a12, xVar3.f())) {
                    return n.DELETE_NEXT_CHAR;
                }
                if (l1.a.l(a12, xVar3.r())) {
                    return n.PASTE;
                }
                if (l1.a.l(a12, xVar3.e())) {
                    return n.CUT;
                }
                if (l1.a.l(a12, xVar3.s())) {
                    return n.TAB;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b extends jo.y {
        public static final b D = new b();

        public b() {
            super(l1.d.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        @Override // qo.g
        public Object get(Object obj) {
            return Boolean.valueOf(l1.d.d(((l1.b) obj).f()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f31582a;

        public c(p pVar) {
            this.f31582a = pVar;
        }

        @Override // f0.p
        public n a(KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            n nVar = null;
            if (l1.d.e(keyEvent) && l1.d.d(keyEvent)) {
                long a10 = l1.d.a(keyEvent);
                x xVar = x.f31662a;
                if (l1.a.l(a10, xVar.h())) {
                    nVar = n.SELECT_LEFT_WORD;
                } else if (l1.a.l(a10, xVar.i())) {
                    nVar = n.SELECT_RIGHT_WORD;
                } else if (l1.a.l(a10, xVar.j())) {
                    nVar = n.SELECT_PREV_PARAGRAPH;
                } else if (l1.a.l(a10, xVar.g())) {
                    nVar = n.SELECT_NEXT_PARAGRAPH;
                }
            } else if (l1.d.d(keyEvent)) {
                long a11 = l1.d.a(keyEvent);
                x xVar2 = x.f31662a;
                if (l1.a.l(a11, xVar2.h())) {
                    nVar = n.LEFT_WORD;
                } else if (l1.a.l(a11, xVar2.i())) {
                    nVar = n.RIGHT_WORD;
                } else if (l1.a.l(a11, xVar2.j())) {
                    nVar = n.PREV_PARAGRAPH;
                } else if (l1.a.l(a11, xVar2.g())) {
                    nVar = n.NEXT_PARAGRAPH;
                } else if (l1.a.l(a11, xVar2.l())) {
                    nVar = n.DELETE_PREV_CHAR;
                } else if (l1.a.l(a11, xVar2.f())) {
                    nVar = n.DELETE_NEXT_WORD;
                } else if (l1.a.l(a11, xVar2.c())) {
                    nVar = n.DELETE_PREV_WORD;
                } else if (l1.a.l(a11, xVar2.b())) {
                    nVar = n.DESELECT;
                }
            } else if (l1.d.e(keyEvent)) {
                long a12 = l1.d.a(keyEvent);
                x xVar3 = x.f31662a;
                if (l1.a.l(a12, xVar3.o())) {
                    nVar = n.SELECT_HOME;
                } else if (l1.a.l(a12, xVar3.n())) {
                    nVar = n.SELECT_END;
                }
            }
            return nVar == null ? this.f31582a.a(keyEvent) : nVar;
        }
    }

    public static final p a(io.l<? super l1.b, Boolean> lVar) {
        jo.p.h(lVar, "shortcutModifier");
        return new a(lVar);
    }

    public static final p b() {
        return f31580a;
    }
}
