package digital.places.woot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestMemberController {

	@RequestMapping(value = "/members", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Members getRestMembers()
	{
		Members members = new Members();
		members.setMembers(findAll());
		return members;
		
	}
	
	@RequestMapping(value = "/membersxml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Members getRestMembersxml()
	{
		Members members = new Members();
		members.setMembers(findAll());
		return members;
		
	}
	@RequestMapping(value = "/membersatom", method = RequestMethod.GET, produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public @ResponseBody Members getRestMembersatom()
	{
		Members members = new Members();
		members.setMembers(findAll());
		return members;
		
	}
	private List<Member> findAll()
	{
		Member member = new Member();
		member.setName("Madhuri");
		List<Member> membersList = new ArrayList<Member>();
		membersList.add(member);
		return membersList;
	}
}
