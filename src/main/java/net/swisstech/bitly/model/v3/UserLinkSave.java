/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.model.v3;

public class UserLinkSave {

	public LinkSave link_save;

	public static class LinkSave {

		public String aggregate_link;

		public String link;

		public String long_url;

		public long new_link;

		@Override
		public String toString() {
			return String.format("LinkSave { aggregate_link=%s link=%s long_url=%s new_link=%d }", aggregate_link, link, long_url, new_link);
		}
	}

	@Override
	public String toString() {
		return String.format("UserLinkSave { link_save=%s }", link_save);
	}
}