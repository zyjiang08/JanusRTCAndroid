package com.serenegiant.janus;
/*
 * JanusRTCAndroid
 * Video chat sample app using videoroom plugin on janus-gateway server and WebRTC.
 *
 * Copyright (c) 2018 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
*/

public class Const {
	/** Janus-gatewayサーバーとの接続タイムアウト設定[ミリ秒] */
	/*package*/ static final long HTTP_CONNECT_TIMEOUT_MS = 3000;
	/** Janus-gatewayサーバーからの読み込みタイムアウト設定[ミリ秒] */
	/*package*/ static final long HTTP_READ_TIMEOUT_MS = 3000;
	/*package*/ static final long HTTP_READ_TIMEOUT_MS_LONG_POLL = 45000;
	/** Janus-gatewayサーバーへの書き込みタイムアウト設定[ミリ秒] */
	/*package*/ static final long HTTP_WRITE_TIMEOUT_MS = 3000;
}
