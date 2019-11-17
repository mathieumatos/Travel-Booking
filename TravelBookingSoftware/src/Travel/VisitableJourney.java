package Travel;
public interface VisitableJourney {

	/**
	 * 
	 * @param jv
	 */
	void accept(JourneyVisitor jv);

}