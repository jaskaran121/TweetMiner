package controllers;

import java.util.Set;

import javax.inject.Inject;

import javassist.compiler.ast.Keyword;
import models.SearchKeyword;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.listresult;
public class TweetMinerController extends Controller {
	@Inject
	FormFactory formfactory;
	
	public Result index() {
		Form<SearchKeyword> form= formfactory.form(SearchKeyword.class);
		return ok( views.html.listresult.render(form,null));      
    }
	
	public Result search()
    {
        Form<SearchKeyword> form = formfactory.form( SearchKeyword.class ).bindFromRequest(  );
        SearchKeyword keyword = form.get();
        SearchKeyword.add(keyword);
        Set<SearchKeyword> keywords = SearchKeyword.allBooks();
        form = formfactory.form( SearchKeyword.class );
        return ok( views.html.listresult.render(form,keywords));
    }

}
