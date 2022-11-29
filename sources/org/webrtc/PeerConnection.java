package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.webrtc.DataChannel;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;

/* loaded from: classes4.dex */
public class PeerConnection {
    private final List<MediaStream> localStreams;
    private final long nativePeerConnection;
    private List<RtpReceiver> receivers;
    private List<RtpSender> senders;
    private List<RtpTransceiver> transceivers;

    /* loaded from: classes4.dex */
    public enum AdapterType {
        UNKNOWN,
        ETHERNET,
        WIFI,
        CELLULAR,
        VPN,
        LOOPBACK
    }

    /* loaded from: classes4.dex */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* loaded from: classes4.dex */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* loaded from: classes4.dex */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* loaded from: classes4.dex */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        @CalledByNative("IceConnectionState")
        public static IceConnectionState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    /* loaded from: classes4.dex */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        @CalledByNative("IceGatheringState")
        public static IceGatheringState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    /* loaded from: classes4.dex */
    public static class IceServer {
        public final String hostname;
        public final String password;
        public final List<String> tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List<String> tlsEllipticCurves;
        @Deprecated
        public final String uri;
        public final List<String> urls;
        public final String username;

        /* loaded from: classes4.dex */
        public static class Builder {
            private String hostname;
            private String password;
            private List<String> tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List<String> tlsEllipticCurves;
            private final List<String> urls;
            private String username;

            public IceServer createIceServer() {
                return new IceServer(this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List<String> list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public Builder setTlsEllipticCurves(List<String> list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }

            private Builder(List<String> list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list != null && !list.isEmpty()) {
                    this.urls = list;
                    return;
                }
                throw new IllegalArgumentException("urls == null || urls.isEmpty(): " + list);
            }
        }

        public static Builder builder(String str) {
            return new Builder(Collections.singletonList(str));
        }

        @CalledByNative("IceServer")
        public String getHostname() {
            return this.hostname;
        }

        @CalledByNative("IceServer")
        public String getPassword() {
            return this.password;
        }

        @CalledByNative("IceServer")
        public List<String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        @CalledByNative("IceServer")
        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        @CalledByNative("IceServer")
        public List<String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        @CalledByNative("IceServer")
        public List<String> getUrls() {
            return this.urls;
        }

        @CalledByNative("IceServer")
        public String getUsername() {
            return this.username;
        }

        public String toString() {
            return this.urls + " [" + this.username + ":" + this.password + "] [" + this.tlsCertPolicy + "] [" + this.hostname + "] [" + this.tlsAlpnProtocols + "] [" + this.tlsEllipticCurves + "]";
        }

        @Deprecated
        public IceServer(String str) {
            this(str, "", "");
        }

        public static Builder builder(List<String> list) {
            return new Builder(list);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, "");
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }

        private IceServer(String str, List<String> list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4, List<String> list2, List<String> list3) {
            if (str != null && list != null && !list.isEmpty()) {
                for (String str5 : list) {
                    if (str5 == null) {
                        throw new IllegalArgumentException("urls element is null: " + list);
                    }
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("username == null");
                }
                if (str3 == null) {
                    throw new IllegalArgumentException("password == null");
                }
                if (str4 != null) {
                    this.uri = str;
                    this.urls = list;
                    this.username = str2;
                    this.password = str3;
                    this.tlsCertPolicy = tlsCertPolicy;
                    this.hostname = str4;
                    this.tlsAlpnProtocols = list2;
                    this.tlsEllipticCurves = list3;
                    return;
                }
                throw new IllegalArgumentException("hostname == null");
            }
            throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
        }
    }

    /* loaded from: classes4.dex */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* loaded from: classes4.dex */
    public static class IntervalRange {
        private final int max;
        private final int min;

        public IntervalRange(int i10, int i11) {
            this.min = i10;
            this.max = i11;
        }

        @CalledByNative("IntervalRange")
        public int getMax() {
            return this.max;
        }

        @CalledByNative("IntervalRange")
        public int getMin() {
            return this.min;
        }
    }

    /* loaded from: classes4.dex */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* loaded from: classes4.dex */
    public interface Observer {
        @CalledByNative("Observer")
        void onAddStream(MediaStream mediaStream);

        @CalledByNative("Observer")
        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        @CalledByNative("Observer")
        void onDataChannel(DataChannel dataChannel);

        @CalledByNative("Observer")
        void onIceCandidate(IceCandidate iceCandidate);

        @CalledByNative("Observer")
        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        @CalledByNative("Observer")
        void onIceConnectionChange(IceConnectionState iceConnectionState);

        @CalledByNative("Observer")
        void onIceConnectionReceivingChange(boolean z10);

        @CalledByNative("Observer")
        void onIceGatheringChange(IceGatheringState iceGatheringState);

        @CalledByNative("Observer")
        void onRemoveStream(MediaStream mediaStream);

        @CalledByNative("Observer")
        void onRenegotiationNeeded();

        @CalledByNative("Observer")
        void onSignalingChange(SignalingState signalingState);

        @CalledByNative("Observer")
        default void onTrack(RtpTransceiver rtpTransceiver) {
        }
    }

    /* loaded from: classes4.dex */
    public static class RTCConfiguration {
        public RtcCertificatePem certificate;
        public List<IceServer> iceServers;
        public TurnCustomizer turnCustomizer;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public int audioJitterBufferMaxPackets = 50;
        public boolean audioJitterBufferFastAccelerate = false;
        public int iceConnectionReceivingTimeout = -1;
        public int iceBackupCandidatePairPingInterval = -1;
        public KeyType keyType = KeyType.ECDSA;
        public ContinualGatheringPolicy continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
        public int iceCandidatePoolSize = 0;
        public boolean pruneTurnPorts = false;
        public boolean presumeWritableWhenFullyRelayed = false;
        public Integer iceCheckIntervalStrongConnectivityMs = null;
        public Integer iceCheckIntervalWeakConnectivityMs = null;
        public Integer iceCheckMinInterval = null;
        public Integer iceUnwritableTimeMs = null;
        public Integer iceUnwritableMinChecks = null;
        public Integer stunCandidateKeepaliveIntervalMs = null;
        public boolean disableIPv6OnWifi = false;
        public int maxIPv6Networks = 5;
        public IntervalRange iceRegatherIntervalRange = null;
        public boolean disableIpv6 = false;
        public boolean enableDscp = false;
        public boolean enableCpuOveruseDetection = true;
        public boolean enableRtpDataChannel = false;
        public boolean suspendBelowMinBitrate = false;
        public Integer screencastMinBitrate = null;
        public Boolean combinedAudioVideoBwe = null;
        public Boolean enableDtlsSrtp = null;
        public AdapterType networkPreference = AdapterType.UNKNOWN;
        public SdpSemantics sdpSemantics = SdpSemantics.PLAN_B;
        public boolean activeResetSrtpParams = false;

        public RTCConfiguration(List<IceServer> list) {
            this.iceServers = list;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getActiveResetSrtpParams() {
            return this.activeResetSrtpParams;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        @CalledByNative("RTCConfiguration")
        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        @CalledByNative("RTCConfiguration")
        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        @CalledByNative("RTCConfiguration")
        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        @CalledByNative("RTCConfiguration")
        public Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        @CalledByNative("RTCConfiguration")
        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        @CalledByNative("RTCConfiguration")
        public Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableRtpDataChannel() {
            return this.enableRtpDataChannel;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        @CalledByNative("RTCConfiguration")
        public IntervalRange getIceRegatherIntervalRange() {
            return this.iceRegatherIntervalRange;
        }

        @CalledByNative("RTCConfiguration")
        public List<IceServer> getIceServers() {
            return this.iceServers;
        }

        @CalledByNative("RTCConfiguration")
        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        @CalledByNative("RTCConfiguration")
        public KeyType getKeyType() {
            return this.keyType;
        }

        @CalledByNative("RTCConfiguration")
        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        @CalledByNative("RTCConfiguration")
        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        @CalledByNative("RTCConfiguration")
        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        @CalledByNative("RTCConfiguration")
        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        @CalledByNative("RTCConfiguration")
        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        @CalledByNative("RTCConfiguration")
        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }
    }

    /* loaded from: classes4.dex */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* loaded from: classes4.dex */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* loaded from: classes4.dex */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        @CalledByNative("SignalingState")
        public static SignalingState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    /* loaded from: classes4.dex */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* loaded from: classes4.dex */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    private native boolean nativeAddIceCandidate(String str, int i10, String str2);

    private native boolean nativeAddLocalStream(long j10);

    private native RtpSender nativeAddTrack(long j10, List<String> list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j10, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    private native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    private static native void nativeFreeOwnedPeerConnection(long j10);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List<RtpReceiver> nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List<RtpSender> nativeGetSenders();

    private native List<RtpTransceiver> nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j10);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j10);

    private native boolean nativeRemoveTrack(long j10);

    private native void nativeSetAudioPlayout(boolean z10);

    private native void nativeSetAudioRecording(boolean z10);

    private native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i10, int i11);

    private native void nativeStopRtcEventLog();

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public boolean addStream(MediaStream mediaStream) {
        if (nativeAddLocalStream(mediaStream.getNativeMediaStream())) {
            this.localStreams.add(mediaStream);
            return true;
        }
        return false;
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.emptyList());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiver.RtpTransceiverInit());
    }

    public void close() {
        nativeClose();
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public DataChannel createDataChannel(String str, DataChannel.Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public RtpSender createSender(String str, String str2) {
        RtpSender nativeCreateSender = nativeCreateSender(str, str2);
        if (nativeCreateSender != null) {
            this.senders.add(nativeCreateSender);
        }
        return nativeCreateSender;
    }

    public void dispose() {
        close();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        for (RtpSender rtpSender : this.senders) {
            rtpSender.dispose();
        }
        this.senders.clear();
        for (RtpReceiver rtpReceiver : this.receivers) {
            rtpReceiver.dispose();
        }
        for (RtpTransceiver rtpTransceiver : this.transceivers) {
            rtpTransceiver.dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    @CalledByNative
    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public List<RtpReceiver> getReceivers() {
        for (RtpReceiver rtpReceiver : this.receivers) {
            rtpReceiver.dispose();
        }
        List<RtpReceiver> nativeGetReceivers = nativeGetReceivers();
        this.receivers = nativeGetReceivers;
        return Collections.unmodifiableList(nativeGetReceivers);
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public List<RtpSender> getSenders() {
        for (RtpSender rtpSender : this.senders) {
            rtpSender.dispose();
        }
        List<RtpSender> nativeGetSenders = nativeGetSenders();
        this.senders = nativeGetSenders;
        return Collections.unmodifiableList(nativeGetSenders);
    }

    @Deprecated
    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        return nativeOldGetStats(statsObserver, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack());
    }

    public List<RtpTransceiver> getTransceivers() {
        for (RtpTransceiver rtpTransceiver : this.transceivers) {
            rtpTransceiver.dispose();
        }
        List<RtpTransceiver> nativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = nativeGetTransceivers;
        return Collections.unmodifiableList(nativeGetTransceivers);
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public void removeStream(MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
        this.localStreams.remove(mediaStream);
    }

    public boolean removeTrack(RtpSender rtpSender) {
        Objects.requireNonNull(rtpSender, "No RtpSender specified for removeTrack.");
        return nativeRemoveTrack(rtpSender.getNativeRtpSender());
    }

    public void setAudioPlayout(boolean z10) {
        nativeSetAudioPlayout(z10);
    }

    public void setAudioRecording(boolean z10) {
        nativeSetAudioRecording(z10);
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public boolean startRtcEventLog(int i10, int i11) {
        return nativeStartRtcEventLog(i10, i11);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public PeerConnection(long j10) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.nativePeerConnection = j10;
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List<String> list) {
        if (mediaStreamTrack != null && list != null) {
            RtpSender nativeAddTrack = nativeAddTrack(mediaStreamTrack.getNativeMediaStreamTrack(), list);
            if (nativeAddTrack != null) {
                this.senders.add(nativeAddTrack);
                return nativeAddTrack;
            }
            throw new IllegalStateException("C++ addTrack failed.");
        }
        throw new NullPointerException("No MediaStreamTrack specified in addTrack.");
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        Objects.requireNonNull(mediaStreamTrack, "No MediaStreamTrack specified for addTransceiver.");
        if (rtpTransceiverInit == null) {
            rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
        }
        RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.getNativeMediaStreamTrack(), rtpTransceiverInit);
        if (nativeAddTransceiverWithTrack != null) {
            this.transceivers.add(nativeAddTransceiverWithTrack);
            return nativeAddTransceiverWithTrack;
        }
        throw new IllegalStateException("C++ addTransceiver failed.");
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        Objects.requireNonNull(mediaType, "No MediaType specified for addTransceiver.");
        if (rtpTransceiverInit == null) {
            rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
        }
        RtpTransceiver nativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
        if (nativeAddTransceiverOfType != null) {
            this.transceivers.add(nativeAddTransceiverOfType);
            return nativeAddTransceiverOfType;
        }
        throw new IllegalStateException("C++ addTransceiver failed.");
    }
}
