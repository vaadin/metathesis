package com.github.taras.gwt.polymer.elements;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

public class CoreLabel extends Widget {

	private static boolean injected = false;

	/*
	 * Constuctor. Ensures that needed html templates are added and injects a <core-label> element to the page.
	 */
	public CoreLabel() {
		super();
		ensureHTMLImport();
		Element el = DOM.createElement("core-label");
		setElement(el);
	}

	/*
	 * Injects the core-field html template to page head section.
	 */
	private static void ensureHTMLImport() {
		if (!injected) {
			Element head = Document.get().getElementsByTagName("head")
					.getItem(0);
			Element htmlImport = Document.get().createLinkElement();
			htmlImport.setAttribute("rel", "import");
			htmlImport.setAttribute("href", GWT.getModuleBaseForStaticFiles()
					+ "components/core-label/core-label.html");
			head.appendChild(htmlImport);
            injected = true;
		}
	}
}
