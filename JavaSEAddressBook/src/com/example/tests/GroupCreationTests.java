package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	@Test
	public void testNonEmptyGroupCreation() throws Exception {
		openMainPage();
		gotoGroupsPage();
		initGroupCreation();
		GroupDate group = new GroupDate();
		group.name = "name1";
		group.header = "header1";
		group.footer = "footer1";
		fillGroupForm(group);
		submitGroupCreation();
		returnToGroupPage();
	}

	@Test
	public void testEmptyGroupCreation() throws Exception {
		openMainPage();
		gotoGroupsPage();
		initGroupCreation();
		fillGroupForm(new GroupDate("", "", ""));
		submitGroupCreation();
		returnToGroupPage();
	}
}
