
    private FragmentActivity mContext;
    ListSharedPreference listSharedPreference;
    private MainViewsCallBack mainViewsCallBack;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        if (context instanceof FragmentActivity) {
            mContext = (FragmentActivity) context;
        }
        super.onAttach(context);
        try {
            mainViewsCallBack = (MainViewsCallBack) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "error");
        }
        listSharedPreference = new ListSharedPreference(context.getApplicationContext());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this,rootView);
        initUI();
        return rootView;
    }

    private void initUI() {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDetach() 
    {
        mainViewsCallBack = null;
        super.onDetach();
    }
}